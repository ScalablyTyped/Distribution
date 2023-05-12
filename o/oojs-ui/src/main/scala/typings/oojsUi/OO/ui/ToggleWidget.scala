package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.ToggleWidget.Props
import typings.oojsUi.OO.ui.ToggleWidget.Prototype
import typings.oojsUi.oojsUiStrings.change
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ToggleWidget implements basic behavior of widgets with an on/off state.
  * Please see OO.ui.ToggleButtonWidget and OO.ui.ToggleSwitchWidget for examples.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ToggleWidget
  */
@js.native
trait ToggleWidget
  extends StObject
     with Props
     with Prototype
object ToggleWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions {
    
    /** The toggle’s initial on/off state. By default, the toggle is in the 'off' state. */
    var value: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ToggleWidget]
       with Instantiable1[/* config */ ConfigOptions, ToggleWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap {
    
    var change: js.Array[/* value */ Boolean]
  }
  object EventMap {
    
    inline def apply(
      change: js.Array[/* value */ Boolean],
      disable: js.Array[/* disabled */ Boolean],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setChange(value: js.Array[/* value */ Boolean]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeVarargs(value: (/* value */ Boolean)*): Self = StObject.set(x, "change", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
  object Props {
    
    inline def apply($element: JQuery[HTMLElement], $titled: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* value */ Boolean]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* value */ Boolean]
    ): Boolean = js.native
    @JSName("emit")
    def emit_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    /**
      * Get the value representing the toggle’s state.
      *
      * @return The on/off state of the toggle
      */
    def getValue(): Boolean = js.native
    
    @JSName("off")
    def off_change[C](event: change): this.type = js.native
    @JSName("off")
    def off_change[C](event: change, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* value */ Boolean], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* value */ Boolean], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
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
    def on_change[A /* <: ArgTuple */, C](
      event: change,
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
    def on_change[A /* <: ArgTuple */, C](
      event: change,
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
    def on_change[A /* <: ArgTuple */, C](
      event: change,
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
    def once_change(
      event: change,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* value */ Boolean], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    
    /**
      * Set the state of the toggle: `true` for 'on', `false` for 'off'.
      *
      * @param value The state of the toggle
      * @return The widget, for chaining
      */
    def setValue(value: Boolean): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
}
