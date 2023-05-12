package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.ButtonGroupWidget.Props
import typings.oojsUi.OO.ui.ButtonGroupWidget.Prototype
import typings.oojsUi.oojsUiStrings.add
import typings.oojsUi.oojsUiStrings.change
import typings.oojsUi.oojsUiStrings.clear
import typings.oojsUi.oojsUiStrings.move
import typings.oojsUi.oojsUiStrings.remove
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ButtonGroupWidget groups related buttons and is used together with OO.ui.ButtonWidget and
  * its subclasses. Each button in a group is addressed by a unique reference. Buttons can be added,
  * removed, and cleared from the group.
  *
  *     // A ButtonGroupWidget with two buttons.
  *     var button1 = new OO.ui.PopupButtonWidget( {
  *             label: 'Select a category',
  *             icon: 'menu',
  *             popup: {
  *                 $content: $( '<p>List of categories…</p>' ),
  *                 padded: true,
  *                 align: 'left'
  *             }
  *         } ),
  *         button2 = new OO.ui.ButtonWidget( {
  *             label: 'Add item'
  *         } ),
  *         buttonGroup = new OO.ui.ButtonGroupWidget( {
  *             items: [ button1, button2 ]
  *         } );
  *     $( document.body ).append( buttonGroup.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ButtonGroupWidget
  */
@js.native
trait ButtonGroupWidget
  extends StObject
     with Props
     with Prototype
object ButtonGroupWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.GroupElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions {
    
    /** Buttons to add */
    var items: js.UndefOr[js.Array[ButtonWidget]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[ButtonWidget]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ButtonWidget*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ButtonGroupWidget]
       with Instantiable1[/* config */ ConfigOptions, ButtonGroupWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.GroupElement.EventMap
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      clear: js.Array[Any],
      disable: js.Array[/* disabled */ Boolean],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      remove: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.GroupElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
  object Props {
    
    inline def apply($element: JQuery[HTMLElement], $group: JQuery[HTMLElement], $titled: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.GroupElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[Element]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_clear(
      event: clear,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_move(
      event: move,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[Element]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_clear(
      event: clear,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_move(
      event: move,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    
    /**
      * Focus the widget
      *
      * @return The widget, for chaining
      */
    def focus(): this.type = js.native
    
    @JSName("off")
    def off_add[C](event: add): this.type = js.native
    @JSName("off")
    def off_add[C](event: add, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_add[C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_add[C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_change[C](event: change): this.type = js.native
    @JSName("off")
    def off_change[C](event: change, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* items */ js.Array[Element]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* items */ js.Array[Element]], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_clear[C](event: clear): this.type = js.native
    @JSName("off")
    def off_clear[C](event: clear, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_clear[C](
      event: clear,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_clear[C](
      event: clear,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_move[C](event: move): this.type = js.native
    @JSName("off")
    def off_move[C](event: move, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_move[C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_move[C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_remove[C](event: remove): this.type = js.native
    @JSName("off")
    def off_remove[C](event: remove, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_remove[C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_remove[C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    @JSName("on")
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
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
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
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
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
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
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
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
    def on_move[A /* <: ArgTuple */, C](
      event: move,
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
    def on_move[A /* <: ArgTuple */, C](
      event: move,
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
    def on_move[A /* <: ArgTuple */, C](
      event: move,
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
    def on_move[A /* <: ArgTuple */, C](
      event: move,
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
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def once_add(
      event: add,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_change(
      event: change,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* items */ js.Array[Element]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_clear(event: clear, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_move(
      event: move,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_remove(
      event: remove,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
}
