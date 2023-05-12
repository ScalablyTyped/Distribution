package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.SelectWidget.Props
import typings.oojsUi.OO.ui.SelectWidget.Prototype
import typings.oojsUi.oojsUiStrings.add
import typings.oojsUi.oojsUiStrings.change
import typings.oojsUi.oojsUiStrings.choose
import typings.oojsUi.oojsUiStrings.clear
import typings.oojsUi.oojsUiStrings.highlight
import typings.oojsUi.oojsUiStrings.move
import typings.oojsUi.oojsUiStrings.press
import typings.oojsUi.oojsUiStrings.remove
import typings.oojsUi.oojsUiStrings.select
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SelectWidget is of a generic selection of options. The OOUI library contains several types
  * of select widgets, including {@link OO.ui.ButtonSelectWidget button selects},
  * {@link OO.ui.RadioSelectWidget radio selects}, and {@link OO.ui.MenuSelectWidget
  * menu selects}.
  *
  * This class should be used together with OO.ui.OptionWidget or OO.ui.DecoratedOptionWidget. For
  * more information, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options).
  *
  *     // A select widget with three options.
  *     var select = new OO.ui.SelectWidget( {
  *         items: [
  *             new OO.ui.OptionWidget( {
  *                 data: 'a',
  *                 label: 'Option One',
  *             } ),
  *             new OO.ui.OptionWidget( {
  *                 data: 'b',
  *                 label: 'Option Two',
  *             } ),
  *             new OO.ui.OptionWidget( {
  *                 data: 'c',
  *                 label: 'Option Three',
  *             } )
  *         ]
  *     } );
  *     $( document.body ).append( select.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.SelectWidget
  */
@js.native
trait SelectWidget
  extends StObject
     with Props
     with Prototype
object SelectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.GroupElement.ConfigOptions {
    
    /**
      * An array of options to add to the select.
      * Options are created with {@link OO.ui.OptionWidget OptionWidget} classes. See
      * the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options)
      * for examples.
      */
    var items: js.UndefOr[js.Array[OptionWidget]] = js.undefined
    
    /** Allow for multiple selections */
    var multiselect: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[OptionWidget]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: OptionWidget*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
      
      inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[SelectWidget]
       with Instantiable1[/* config */ ConfigOptions, SelectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  // HACK: Copy properties of mixin.GroupElement.EventMap instead of extending
  // SelectWidget arguments the params of EmitterList's 'add' and 'remove' events in a way not
  // allowed in TypeScript, so we need to omit them from GroupElement.EventMap which extends
  // EmitterListEventMap. Unfortunately, doing such will result in a TS2430 error on
  // SelectWidget.Prototype, and by copy-pasting properties this problem is solved.
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap {
    
    var add: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]
    
    // Omit<mixin.GroupElement.EventMap, 'add' | 'remove' >
    var change: js.Array[/* items */ js.Array[Element]]
    
    var choose: js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean]
    
    var clear: js.Array[Any]
    
    var highlight: js.Array[/* item */ OptionWidget | Null]
    
    var move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]
    
    var press: js.Array[/* item */ OptionWidget | Null]
    
    var remove: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]
    
    var select: js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null]
  }
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      choose: js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean],
      clear: js.Array[Any],
      disable: js.Array[/* disabled */ Boolean],
      highlight: js.Array[/* item */ OptionWidget | Null],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      press: js.Array[/* item */ OptionWidget | Null],
      remove: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double],
      select: js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], choose = choose.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], press = press.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setChange(value: js.Array[/* items */ js.Array[Element]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeVarargs(value: (/* items */ js.Array[Element])*): Self = StObject.set(x, "change", js.Array(value*))
      
      inline def setChoose(value: js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean]): Self = StObject.set(x, "choose", value.asInstanceOf[js.Any])
      
      inline def setClear(value: js.Array[Any]): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearVarargs(value: Any*): Self = StObject.set(x, "clear", js.Array(value*))
      
      inline def setHighlight(value: js.Array[/* item */ OptionWidget | Null]): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightVarargs(value: (/* item */ OptionWidget | Null)*): Self = StObject.set(x, "highlight", js.Array(value*))
      
      inline def setMove(value: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setPress(value: js.Array[/* item */ OptionWidget | Null]): Self = StObject.set(x, "press", value.asInstanceOf[js.Any])
      
      inline def setPressVarargs(value: (/* item */ OptionWidget | Null)*): Self = StObject.set(x, "press", js.Array(value*))
      
      inline def setRemove(value: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectVarargs(value: (/* items */ js.Array[OptionWidget] | OptionWidget | Null)*): Self = StObject.set(x, "select", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.GroupElement.Props {
    
    @JSName("$focusOwner")
    var $focusOwner: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($element: JQuery[HTMLElement], $focusOwner: JQuery[HTMLElement], $group: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $focusOwner = $focusOwner.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$focusOwner(value: JQuery[HTMLElement]): Self = StObject.set(x, "$focusOwner", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.GroupElement.Prototype {
    
    /**
      * Choose an item.
      *
      * Note that ‘choose’ should never be modified programmatically. A user can choose
      * an option with the keyboard or mouse and it becomes selected. To select an item
      * programmatically, use the {@link selectItem} method.
      *
      * This method is identical to {@link selectItem}, but may vary in subclasses that take
      * additional action when users choose an item with the keyboard or mouse.
      *
      * @param item Item to choose
      * @return The widget, for chaining
      */
    def chooseItem(item: OptionWidget): this.type = js.native
    
    @JSName("emitThrow")
    def emitThrow_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[Element]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_choose(
      event: choose,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_clear(
      event: clear,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_highlight(
      event: highlight,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ OptionWidget | Null]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_move(
      event: move,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_press(
      event: press,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ OptionWidget | Null]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_select(
      event: select,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[Element]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_choose(
      event: choose,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean]
    ): Boolean = js.native
    @JSName("emit")
    def emit_clear(
      event: clear,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_highlight(
      event: highlight,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ OptionWidget | Null]
    ): Boolean = js.native
    @JSName("emit")
    def emit_move(
      event: move,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_press(
      event: press,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ OptionWidget | Null]
    ): Boolean = js.native
    @JSName("emit")
    def emit_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_select(
      event: select,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null]
    ): Boolean = js.native
    
    /**
      * Find the next selectable item or `null` if there are no selectable items.
      * Disabled options and menu-section markers and breaks are not selectable.
      *
      * @return Item, `null` if there aren't any selectable items
      */
    def findFirstSelectableItem(): OptionWidget | Null = js.native
    
    /**
      * @return The first (of possibly many) selected item, if any
      */
    def findFirstSelectedItem(): OptionWidget | Null = js.native
    
    /**
      * Find highlighted item.
      *
      * @return Highlighted item, `null` if no item is highlighted
      */
    def findHighlightedItem(): OptionWidget | Null = js.native
    
    def findRelativeSelectableItem(item: Null, offset: Double): OptionWidget | Null = js.native
    def findRelativeSelectableItem(item: Null, offset: Double, filter: js.Function1[/* item */ OptionWidget, Boolean]): OptionWidget | Null = js.native
    def findRelativeSelectableItem(item: Null, offset: Double, filter: js.Function1[/* item */ OptionWidget, Boolean], wrap: Boolean): OptionWidget | Null = js.native
    def findRelativeSelectableItem(item: Null, offset: Double, filter: Unit, wrap: Boolean): OptionWidget | Null = js.native
    /**
      * Find an option by its position relative to the specified item (or to the start of the option
      * array, if item is `null`). The direction and distance in which to search through the option array
      * is specified with a number: e.g. -1 for the previous item (the default) or 1 for the next item,
      * or 15 for the 15th next item, etc. The method will return an option, or `null` if there are no
      * options in the array.
      *
      * @param item Item to describe the start position, or `null` to start at
      *  the beginning of the array.
      * @param offset Relative position: negative to move backward, positive to move forward
      * @param filter Only consider items for which this function returns
      *  true. Function takes an OO.ui.OptionWidget and returns a boolean.
      * @param wrap Do not wrap around after reaching the last or first item
      * @return Item at position, `null` if there are no items in the select
      */
    def findRelativeSelectableItem(item: OptionWidget, offset: Double): OptionWidget | Null = js.native
    def findRelativeSelectableItem(item: OptionWidget, offset: Double, filter: js.Function1[/* item */ OptionWidget, Boolean]): OptionWidget | Null = js.native
    def findRelativeSelectableItem(
      item: OptionWidget,
      offset: Double,
      filter: js.Function1[/* item */ OptionWidget, Boolean],
      wrap: Boolean
    ): OptionWidget | Null = js.native
    def findRelativeSelectableItem(item: OptionWidget, offset: Double, filter: Unit, wrap: Boolean): OptionWidget | Null = js.native
    
    /**
      * Find selected item.
      *
      * @return If the widget is multiselect
      *  then return an array of selected items (or empty array),
      *  if the widget is not multiselect, return a single selected item, or `null`
      *  if no item is selected
      */
    def findSelectedItem(): js.Array[OptionWidget] | OptionWidget | Null = js.native
    
    /**
      * Find all selected items, if there are any. If the widget allows for multiselect
      * it will return an array of selected options. If the widget doesn't allow for
      * multiselect, it will return the selected option or null if no item is selected.
      *
      * @return If the widget is multiselect
      *  then return an array of selected items (or empty array),
      *  if the widget is not multiselect, return a single selected item, or `null`
      *  if no item is selected
      */
    def findSelectedItems(): js.Array[OptionWidget] | OptionWidget | Null = js.native
    
    /**
      * Fetch an item by its label.
      *
      * @param label Label of the item to select.
      * @param prefix Allow a prefix match, if only a single item matches
      * @return Item with equivalent label, `null` if none exists
      */
    def getItemFromLabel(label: String): Element | Null = js.native
    def getItemFromLabel(label: String, prefix: Boolean): Element | Null = js.native
    
    /**
      * Highlight an option. If the `item` param is omitted, no options will be highlighted
      * and any existing highlight will be removed. The highlight is mutually exclusive.
      *
      * @param item Item to highlight, omit for no highlight
      * @return The widget, for chaining
      */
    def highlightItem(): this.type = js.native
    def highlightItem(item: OptionWidget): this.type = js.native
    
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
            /* args */ js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double], 
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
            /* args */ js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double], 
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
    def off_choose[C](event: choose): this.type = js.native
    @JSName("off")
    def off_choose[C](event: choose, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_choose[C](
      event: choose,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_choose[C](
      event: choose,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean], 
            Unit
          ]
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
    def off_highlight[C](event: highlight): this.type = js.native
    @JSName("off")
    def off_highlight[C](event: highlight, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_highlight[C](
      event: highlight,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ OptionWidget | Null], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_highlight[C](
      event: highlight,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ OptionWidget | Null], Unit]
        ],
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
    def off_press[C](event: press): this.type = js.native
    @JSName("off")
    def off_press[C](event: press, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_press[C](
      event: press,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ OptionWidget | Null], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_press[C](
      event: press,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ OptionWidget | Null], Unit]
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
            /* args */ js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double], 
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
            /* args */ js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_select[C](event: select): this.type = js.native
    @JSName("off")
    def off_select[C](event: select, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_select[C](
      event: select,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_select[C](
      event: select,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null], 
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
    def on_choose[A /* <: ArgTuple */, C](
      event: choose,
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
    def on_choose[A /* <: ArgTuple */, C](
      event: choose,
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
    def on_choose[A /* <: ArgTuple */, C](
      event: choose,
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
    def on_choose[A /* <: ArgTuple */, C](
      event: choose,
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
    // #region EventEmitter overloads
    @JSName("on")
    def on_highlight[A /* <: ArgTuple */, C](
      event: highlight,
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
    def on_highlight[A /* <: ArgTuple */, C](
      event: highlight,
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
    def on_highlight[A /* <: ArgTuple */, C](
      event: highlight,
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
    def on_highlight[A /* <: ArgTuple */, C](
      event: highlight,
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
    def on_press[A /* <: ArgTuple */, C](
      event: press,
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
    def on_press[A /* <: ArgTuple */, C](
      event: press,
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
    def on_press[A /* <: ArgTuple */, C](
      event: press,
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
    def on_press[A /* <: ArgTuple */, C](
      event: press,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
          /* args */ js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_change(
      event: change,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* items */ js.Array[Element]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_choose(
      event: choose,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_clear(event: clear, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_highlight(
      event: highlight,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* item */ OptionWidget | Null], Unit]
    ): this.type = js.native
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
    def once_press(
      event: press,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* item */ OptionWidget | Null], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_remove(
      event: remove,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_select(
      event: select,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null], 
          Unit
        ]
    ): this.type = js.native
    
    /**
      * Press an item.
      *
      * Press is a state that occurs when a user mouses down on an item, but has not
      * yet let go of the mouse. The item may appear selected, but it will not be selected
      * until the user releases the mouse.
      *
      * @param item Item to press, omit to depress all
      * @return The widget, for chaining
      */
    def pressItem(): this.type = js.native
    def pressItem(item: OptionWidget): this.type = js.native
    
    /**
      * Scroll item into view, preventing spurious mouse highlight actions from happening.
      *
      * @param item Item to scroll into view
      */
    def scrollItemIntoView(item: OptionWidget): Unit = js.native
    
    /**
      * Programmatically select an option by its reference. If the `item` parameter is
      * omitted, all options will be deselected.
      *
      * @param item Item to select, omit to deselect all
      * @return The widget, for chaining
      */
    def selectItem(): this.type = js.native
    def selectItem(item: OptionWidget): this.type = js.native
    
    /**
      * Programmatically select an option by its data. If the `data` parameter is omitted,
      * or if the item does not exist, all options will be deselected.
      *
      * @param data Value of the item to select, omit to deselect all
      * @return The widget, for chaining
      */
    def selectItemByData(): this.type = js.native
    def selectItemByData(data: Any): this.type = js.native
    
    /**
      * Programmatically select an option by its label. If the item does not exist,
      * all options will be deselected.
      *
      * @param label Label of the item to select.
      * @param prefix Allow a prefix match, if only a single item matches
      * @return The widget, for chaining
      */
    def selectItemByLabel(): this.type = js.native
    def selectItemByLabel(label: String): this.type = js.native
    def selectItemByLabel(label: String, prefix: Boolean): this.type = js.native
    def selectItemByLabel(label: Unit, prefix: Boolean): this.type = js.native
    
    /**
      * Toggle pressed state.
      *
      * Press is a state that occurs when a user mouses down on an item, but
      * has not yet let go of the mouse. The item may appear selected, but it will not be
      * selected until the user releases the mouse.
      *
      * @param pressed An option is being pressed
      */
    def togglePressed(pressed: Boolean): Unit = js.native
    
    /**
      * Programmatically unselect an option by its reference. If the widget
      * allows for multiple selections, there may be other items still selected;
      * otherwise, no items will be selected.
      * If no item is given, all selected items will be unselected.
      *
      * @param unselectedItem Item to unselect
      * @return The widget, for chaining
      */
    def unselectItem(): this.type = js.native
    def unselectItem(unselectedItem: OptionWidget): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static {
    
    /**
      * Whether this widget will respond to the navigation keys Home, End, PageUp, PageDown.
      */
    var handleNavigationKeys: Boolean = js.native
    
    /**
      * Whether selecting items using arrow keys or navigation keys in this widget will wrap
      * around after the user reaches the beginning or end of the list.
      */
    var listWrapsAround: Boolean = js.native
    
    /**
      * Normalize text for filter matching
      *
      * @param text Text
      * @return Normalized text
      */
    def normalizeForMatching(text: String): String = js.native
  }
}
