package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.Element.Props
import typings.oojsUi.OO.ui.PageLayout.Prototype
import typings.oojsUi.anon.PartialRecordkeyofEventMaActive
import typings.oojsUi.oojsUiStrings.active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PageLayouts are used within {@link OO.ui.BookletLayout booklet layouts} to create pages that
  * users can select and display from the booklet's optional
  * {@link OO.ui.OutlineSelectWidget outline} navigation. Pages are usually not instantiated
  * directly, rather extended to include the required content and functionality.
  *
  * Each page must have a unique symbolic name, which is passed to the constructor. In addition,
  * the page's outline item is customized (with a label, outline level, etc.) using
  * the setupOutlineItem method. See {@link OO.ui.BookletLayout BookletLayout} for an example.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.PageLayout
  */
@js.native
trait PageLayout
  extends StObject
     with Props
     with Prototype
object PageLayout {
  
  type ConfigOptions = typings.oojsUi.OO.ui.PanelLayout.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param name Unique symbolic name of page
    * @param config Configuration options
    */
  Instantiable1[/* name */ String, PageLayout]
       with Instantiable2[/* name */ String, /* config */ ConfigOptions, PageLayout] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.PanelLayout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.PanelLayout.Constructor = js.native
  }
  
  trait EventMap extends StObject {
    
    var active: js.Array[/* active */ Boolean]
  }
  object EventMap {
    
    inline def apply(active: js.Array[/* active */ Boolean]): EventMap = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setActive(value: js.Array[/* active */ Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveVarargs(value: (/* active */ Boolean)*): Self = StObject.set(x, "active", js.Array(value*))
    }
  }
  
  type Props = typings.oojsUi.OO.ui.PanelLayout.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.PanelLayout.Prototype {
    
    def connect[T /* <: PartialRecordkeyofEventMaActive */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaActive */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    @JSName("emitThrow")
    def emitThrow_active(
      event: active,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* active */ Boolean]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_active[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_active(
      event: active,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* active */ Boolean]
    ): Boolean = js.native
    @JSName("emit")
    def emit_active[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    /**
      * Get the symbolic name of the page.
      *
      * @return Symbolic name of page
      */
    def getName(): String = js.native
    
    /**
      * Get outline item.
      *
      * The outline item allows users to access the page from the booklet's outline
      * navigation. The outline item itself can be customized (with a label, level, etc.)
      * using the setupOutlineItem method.
      *
      * @return Outline option widget
      */
    def getOutlineItem(): OutlineOptionWidget | Null = js.native
    
    /**
      * Check if page is active.
      *
      * Pages become active when they are shown in a {@link OO.ui.BookletLayout booklet layout}
      * that is configured to display only one page at a time. Additional CSS is applied to
      * the  page's outline item to reflect the active state.
      *
      * @return Page is active
      */
    def isActive(): Boolean = js.native
    
    @JSName("off")
    def off_active[C](event: active): this.type = js.native
    @JSName("off")
    def off_active[C](event: active, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_active[C](
      event: active,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* active */ Boolean], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_active[C](
      event: active,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* active */ Boolean], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any
    ): this.type = js.native
    @JSName("off")
    def off_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("on")
    def on_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    @JSName("on")
    def on_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_active[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    
    @JSName("once")
    def once_active(
      event: active,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* active */ Boolean], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_active[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'active' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    
    /**
      * Set the page to its 'active' state.
      *
      * Pages become active when they are shown in a booklet layout that is configured to
      * display only one page at a time. Additional CSS is applied to the outline item to
      * reflect the page's active state. Outside of the booklet context, setting the active
      * state on a page does nothing.
      *
      * @param active Page is active
      */
    def setActive(active: Boolean): Unit = js.native
    
    /**
      * Set or unset the outline item.
      *
      * Specify an {@link OO.ui.OutlineOptionWidget outline option} to set it,
      * or `null` to clear the outline item. To customize the outline item itself (e.g., to
      * set a label or outline level), use setupOutlineItem instead of this method.
      *
      * @param outlineItem Outline option widget, null to clear
      * @return The layout, for chaining
      */
    def setOutlineItem(): this.type = js.native
    def setOutlineItem(outlineItem: OutlineOptionWidget): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.PanelLayout.Static
}
