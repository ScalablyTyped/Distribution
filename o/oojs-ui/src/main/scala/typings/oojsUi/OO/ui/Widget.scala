package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.Element.Props
import typings.oojsUi.OO.ui.Widget.Prototype
import typings.oojsUi.anon.PartialRecordkeyofEventMaDisableToggle
import typings.oojsUi.oojsUiStrings.disable
import typings.oojsUi.oojsUiStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Widgets are compositions of one or more OOUI elements that users can both view
  * and interact with. All widgets can be configured and modified via a standard API,
  * and their state can change dynamically according to a model.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Widget
  */
@js.native
trait Widget
  extends StObject
     with Props
     with Prototype
object Widget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Element.ConfigOptions {
    
    /** Disable the widget. Disabled widgets cannot be used and their appearance reflects this state. */
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[Widget]
       with Instantiable1[/* config */ ConfigOptions, Widget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Element.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Element.Constructor = js.native
  }
  
  trait EventMap extends StObject {
    
    var disable: js.Array[/* disabled */ Boolean]
    
    var toggle: js.Array[/* visible */ Boolean]
  }
  object EventMap {
    
    inline def apply(disable: js.Array[/* disabled */ Boolean], toggle: js.Array[/* visible */ Boolean]): EventMap = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: js.Array[/* disabled */ Boolean]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableVarargs(value: (/* disabled */ Boolean)*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setToggle(value: js.Array[/* visible */ Boolean]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleVarargs(value: (/* visible */ Boolean)*): Self = StObject.set(x, "toggle", js.Array(value*))
    }
  }
  
  type Props = typings.oojsUi.OO.ui.Element.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Element.Prototype
       with EventEmitter {
    
    def connect[T /* <: PartialRecordkeyofEventMaDisableToggle */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaDisableToggle */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def emit[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    def emitThrow[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_disable(
      event: disable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* disabled */ Boolean]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_toggle(
      event: toggle,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* visible */ Boolean]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_disable(
      event: disable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* disabled */ Boolean]
    ): Boolean = js.native
    @JSName("emit")
    def emit_toggle(
      event: toggle,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* visible */ Boolean]
    ): Boolean = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    def getInputId(): String | Null = js.native
    
    /**
      * Check if the widget is disabled.
      *
      * @return Widget is disabled
      */
    def isDisabled(): Boolean = js.native
    
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_disable[C](event: disable): this.type = js.native
    @JSName("off")
    def off_disable[C](event: disable, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_disable[C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* disabled */ Boolean], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_disable[C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* disabled */ Boolean], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_toggle[C](event: toggle): this.type = js.native
    @JSName("off")
    def off_toggle[C](event: toggle, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_toggle[C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* visible */ Boolean], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_toggle[C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* visible */ Boolean], Unit]
        ],
      context: C
    ): this.type = js.native
    
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
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
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
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
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
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
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
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
    @JSName("on")
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
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
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
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
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
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
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
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
    
    def once[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'disable' | 'toggle' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_disable(
      event: disable,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* disabled */ Boolean], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_toggle(
      event: toggle,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* visible */ Boolean], Unit]
    ): this.type = js.native
    
    /**
      * Set the 'disabled' state of the widget.
      *
      * When a widget is disabled, it cannot be used and its appearance is updated to reflect this state.
      *
      * @param disabled Disable widget
      * @return The widget, for chaining
      */
    def setDisabled(disabled: Boolean): this.type = js.native
    
    /**
      * Set the element with the given ID as a label for this widget.
      *
      * @param id
      */
    def setLabelledBy(): Unit = js.native
    def setLabelledBy(id: String): Unit = js.native
    
    /**
      * Simulate the behavior of clicking on a label (a HTML `<label>` element) bound to this input.
      * HTML only allows `<label>` to act on specific "labelable" elements; complex widgets might need to
      * override this method to provide intuitive, accessible behavior.
      *
      * By default, this does nothing. {@link OO.ui.mixin.TabIndexedElement} overrides it for focusable widgets.
      * Individual widgets may override it too.
      *
      * This method is called by {@link OO.ui.LabelWidget} and {@link OO.ui.FieldLayout}. It should not be called
      * directly.
      */
    def simulateLabelClick(): Unit = js.native
    
    /**
      * Update the disabled state, in case of changes in parent widget.
      *
      * @return The widget, for chaining
      */
    def updateDisabled(): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Element.Static
}
