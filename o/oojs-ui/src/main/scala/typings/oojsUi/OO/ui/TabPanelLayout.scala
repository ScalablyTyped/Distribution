package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.Element.Props
import typings.oojsUi.OO.ui.TabPanelLayout.Prototype
import typings.oojsUi.anon.PartialRecordkeyofEventMaActive
import typings.oojsUi.oojsUiStrings.active
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TabPanelLayouts are used within {@link OO.ui.IndexLayout index layouts} to create tab panels that
  * users can select and display from the index's optional {@link OO.ui.TabSelectWidget tab}
  * navigation. TabPanels are usually not instantiated directly, rather extended to include the
  * required content and functionality.
  *
  * Each tab panel must have a unique symbolic name, which is passed to the constructor. In addition,
  * the tab panel's tab item is customized (with a label) using the {@link setupTabItem} method. See
  * {@link OO.ui.IndexLayout IndexLayout} for an example.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.TabPanelLayout
  */
@js.native
trait TabPanelLayout
  extends StObject
     with Props
     with Prototype
object TabPanelLayout {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.PanelLayout.ConfigOptions {
    
    /** Label for tab panel's tab */
    var label: js.UndefOr[Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet] = js.undefined
    
    /** Additional tab item config */
    var tabItemConfig: js.UndefOr[typings.oojsUi.OO.ui.TabOptionWidget.ConfigOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction0(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTabItemConfig(value: typings.oojsUi.OO.ui.TabOptionWidget.ConfigOptions): Self = StObject.set(x, "tabItemConfig", value.asInstanceOf[js.Any])
      
      inline def setTabItemConfigUndefined: Self = StObject.set(x, "tabItemConfig", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param name Unique symbolic name of tab panel
    * @param config Configuration options
    */
  Instantiable1[/* name */ String, TabPanelLayout]
       with Instantiable2[/* name */ String, /* config */ ConfigOptions, TabPanelLayout] {
    
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
      * Get the symbolic name of the tab panel.
      *
      * @return Symbolic name of tab panel
      */
    def getName(): String = js.native
    
    /**
      * Get tab item.
      *
      * The tab item allows users to access the tab panel from the index's tab
      * navigation. The tab item itself can be customized (with a label, level, etc.) using the
      * {@link setupTabItem} method.
      *
      * @return  Tab option widget
      */
    def getTabItem(): TabOptionWidget | Null = js.native
    
    /**
      * Get config for creating a tab item.
      *
      * @return Tab option config
      */
    def getTabItemConfig(): typings.oojsUi.OO.ui.TabOptionWidget.ConfigOptions = js.native
    
    /**
      * Check if tab panel is active.
      *
      * Tab panels become active when they are shown in a {@link OO.ui.IndexLayout index layout} that is
      * configured to display only one tab panel at a time. Additional CSS is applied to the tab panel's
      * tab item to reflect the active state.
      *
      * @return Tab panel is active
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
      * Set the tab panel to its 'active' state.
      *
      * Tab panels become active when they are shown in a index layout that is configured to display only
      * one tab panel at a time. Additional CSS is applied to the tab item to reflect the tab panel's
      * active state. Outside of the index context, setting the active state on a tab panel does nothing.
      *
      * @param active Tab panel is active
      */
    def setActive(active: Boolean): Unit = js.native
    
    /**
      * Set or unset the tab item.
      *
      * Specify a {@link OO.ui.TabOptionWidget tab option} to set it,
      * or `null` to clear the tab item. To customize the tab item itself (e.g., to set a label or tab
      * level), use {@link setupTabItem} instead of this method.
      *
      * @param tabItem Tab option widget, null to clear
      * @return The layout, for chaining
      */
    def setTabItem(): this.type = js.native
    def setTabItem(tabItem: TabOptionWidget): this.type = js.native
    
    /**
      * Set up the tab item.
      *
      * Use this method to customize the tab item (e.g., to add a label or tab level). To set or unset
      * the tab item itself (with a {@link OO.ui.TabOptionWidget tab option} or `null`), use
      * the {@link setTabItem} method instead.
      *
      * @return The layout, for chaining
      */
    def setupTabItem(): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.PanelLayout.Static
}
