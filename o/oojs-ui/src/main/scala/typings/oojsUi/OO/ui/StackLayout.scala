package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.StackLayout.Props
import typings.oojsUi.OO.ui.StackLayout.Prototype
import typings.oojsUi.anon.PartialRecordkeyofEventMaAddChange
import typings.oojsUi.oojsUiStrings.add
import typings.oojsUi.oojsUiStrings.change
import typings.oojsUi.oojsUiStrings.clear
import typings.oojsUi.oojsUiStrings.move
import typings.oojsUi.oojsUiStrings.remove
import typings.oojsUi.oojsUiStrings.set
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StackLayouts contain a series of {@link OO.ui.PanelLayout panel layouts}. By default, only one
  * panel is displayed at a time, though the stack layout can also be configured to show all
  * contained panels, one after another, by setting the {@link StackLayout.ConfigOptions.continuous continuous}
  * option to 'true'.
  *
  *     // A stack layout with two panels, configured to be displayed continuously
  *     var myStack = new OO.ui.StackLayout( {
  *         items: [
  *             new OO.ui.PanelLayout( {
  *                 $content: $( '<p>Panel One</p>' ),
  *                 padded: true,
  *                 framed: true
  *             } ),
  *             new OO.ui.PanelLayout( {
  *                 $content: $( '<p>Panel Two</p>' ),
  *                 padded: true,
  *                 framed: true
  *             } )
  *         ],
  *         continuous: true
  *     } );
  *     $( document.body ).append( myStack.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.StackLayout
  */
@js.native
trait StackLayout
  extends StObject
     with Props
     with Prototype
object StackLayout {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.PanelLayout.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.GroupElement.ConfigOptions {
    
    /**
      * Show all panels, one after another. By default, only one panel is displayed at a time.
      */
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    /** Panel layouts to add to the stack layout. */
    var items: js.UndefOr[js.Array[Layout]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setItems(value: js.Array[Layout]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Layout*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[StackLayout]
       with Instantiable1[/* config */ ConfigOptions, StackLayout] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.PanelLayout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.PanelLayout.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.mixin.GroupElement.EventMap {
    
    var set: js.Array[/* item */ Layout | Null]
  }
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      clear: js.Array[Any],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      remove: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      set: js.Array[/* item */ Layout | Null]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setSet(value: js.Array[/* item */ Layout | Null]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetVarargs(value: (/* item */ Layout | Null)*): Self = StObject.set(x, "set", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.GroupElement.Props
  object Props {
    
    inline def apply($element: JQuery[HTMLElement], $group: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.PanelLayout.Prototype
       with typings.oojsUi.OO.ui.mixin.GroupElement.Prototype {
    
    def connect[T /* <: PartialRecordkeyofEventMaAddChange */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaAddChange */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
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
    @JSName("emitThrow")
    def emitThrow_set(
      event: set,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ Layout | Null]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_set[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      args: Any*
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
    @JSName("emit")
    def emit_set(
      event: set,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ Layout | Null]
    ): Boolean = js.native
    @JSName("emit")
    def emit_set[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    /**
      * Get the current panel.
      *
      * @return
      */
    def getCurrentItem(): Layout | Null = js.native
    
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
    @JSName("off")
    def off_set[C](event: set): this.type = js.native
    @JSName("off")
    def off_set[C](event: set, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_set[C](
      event: set,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ Layout | Null], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_set[C](
      event: set,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ Layout | Null], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any
    ): this.type = js.native
    @JSName("off")
    def off_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
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
    @JSName("on")
    def on_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("on")
    def on_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    @JSName("on")
    def on_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_set[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    @JSName("once")
    def once_set(
      event: set,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* item */ Layout | Null], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_set[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    
    /**
      * Show the specified panel.
      *
      * If another panel is currently displayed, it will be hidden.
      *
      * @param item Panel to show
      * @return The layout, for chaining
      */
    def setItem(item: Layout): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.PanelLayout.Static
}
