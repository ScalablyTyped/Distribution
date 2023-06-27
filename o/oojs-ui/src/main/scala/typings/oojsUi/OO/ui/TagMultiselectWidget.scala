package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.TagMultiselectWidget.Props
import typings.oojsUi.OO.ui.TagMultiselectWidget.Prototype
import typings.oojsUi.OO.ui.mixin.DraggableElement
import typings.oojsUi.oojsUiStrings.`inline`
import typings.oojsUi.oojsUiStrings.add
import typings.oojsUi.oojsUiStrings.change
import typings.oojsUi.oojsUiStrings.clear
import typings.oojsUi.oojsUiStrings.drag
import typings.oojsUi.oojsUiStrings.draggable
import typings.oojsUi.oojsUiStrings.flag
import typings.oojsUi.oojsUiStrings.move
import typings.oojsUi.oojsUiStrings.none
import typings.oojsUi.oojsUiStrings.outline
import typings.oojsUi.oojsUiStrings.remove
import typings.oojsUi.oojsUiStrings.reorder
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A basic tag multiselect widget, similar in concept to
  * {@link OO.ui.ComboBoxInputWidget combo box widget} that allows the user to add multiple values
  * that are displayed in a tag area.
  *
  * This widget is a base widget; see {@link OO.ui.MenuTagMultiselectWidget MenuTagMultiselectWidget}
  * and {@link OO.ui.PopupTagMultiselectWidget PopupTagMultiselectWidget} for the implementations
  * that use a menu and a popup respectively.
  *
  *     // A TagMultiselectWidget.
  *     var widget = new OO.ui.TagMultiselectWidget( {
  *         inputPosition: 'outline',
  *         allowedValues: [ 'Option 1', 'Option 2', 'Option 3' ],
  *         selected: [ 'Option 1' ]
  *     } );
  *     $( document.body ).append( widget.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.TagMultiselectWidget
  */
@js.native
trait TagMultiselectWidget
  extends StObject
     with Props
     with Prototype {
  
  /**
    * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
    * value.
    *
    * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
    * instead.
    *
    * @return The ID of the labelable element
    */
  /* InferMemberOverrides */
  override def getInputId(): String | Null = js.native
}
object TagMultiselectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.DraggableGroupElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions {
    
    /** Allow data items to be added even if not present in the menu. */
    var allowArbitrary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow the display of
      * invalid tags. These tags will display with an invalid state, and
      * the widget as a whole will have an invalid state if any invalid tags
      * are present.
      */
    var allowDisplayInvalidTags: js.UndefOr[Boolean] = js.undefined
    
    /** Allow duplicate items to be added */
    var allowDuplicates: js.UndefOr[Boolean] = js.undefined
    
    /** Allow editing of the tags by clicking them */
    var allowEditTags: js.UndefOr[Boolean] = js.undefined
    
    /** Allow reordering of the items */
    var allowReordering: js.UndefOr[Boolean] = js.undefined
    
    /** An array representing the allowed items by their datas. */
    var allowedValues: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Configuration options for the input widget */
    var input: js.UndefOr[typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions] = js.undefined
    
    /**
      * Position of the input. Options are:
      * - inline: The input is invisible, but exists inside the tag list, so
      *   the user types into the tag groups to add tags.
      * - outline: The input is underneath the tag area.
      * - none: No input supplied
      */
    var inputPosition: js.UndefOr[`inline` | outline | none] = js.undefined
    
    /**
      * An optional input widget. If given, it will
      * replace the input widget used in the TagMultiselectWidget. If not given,
      * TagMultiselectWidget creates its own.
      */
    var inputWidget: js.UndefOr[InputWidget] = js.undefined
    
    /**
      * Placeholder text for the input box
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * A set of selected tags. If given,
      * these will appear in the tag list on initialization, as long as they
      * pass the validity tests.
      */
    var selected: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * An optional limit on the number of selected options.
      * If 'tagLimit' is set and is reached, the input is disabled, not allowing any
      * additions. If 'tagLimit' is unset or is 0, an unlimited number of items can be
      * added.
      */
    var tagLimit: js.UndefOr[Double] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowArbitrary(value: Boolean): Self = StObject.set(x, "allowArbitrary", value.asInstanceOf[js.Any])
      
      inline def setAllowArbitraryUndefined: Self = StObject.set(x, "allowArbitrary", js.undefined)
      
      inline def setAllowDisplayInvalidTags(value: Boolean): Self = StObject.set(x, "allowDisplayInvalidTags", value.asInstanceOf[js.Any])
      
      inline def setAllowDisplayInvalidTagsUndefined: Self = StObject.set(x, "allowDisplayInvalidTags", js.undefined)
      
      inline def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
      
      inline def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
      
      inline def setAllowEditTags(value: Boolean): Self = StObject.set(x, "allowEditTags", value.asInstanceOf[js.Any])
      
      inline def setAllowEditTagsUndefined: Self = StObject.set(x, "allowEditTags", js.undefined)
      
      inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
      
      inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
      
      inline def setAllowedValues(value: js.Array[Any]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
      
      inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
      
      inline def setAllowedValuesVarargs(value: Any*): Self = StObject.set(x, "allowedValues", js.Array(value*))
      
      inline def setInput(value: typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputPosition(value: `inline` | outline | none): Self = StObject.set(x, "inputPosition", value.asInstanceOf[js.Any])
      
      inline def setInputPositionUndefined: Self = StObject.set(x, "inputPosition", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInputWidget(value: InputWidget): Self = StObject.set(x, "inputWidget", value.asInstanceOf[js.Any])
      
      inline def setInputWidgetUndefined: Self = StObject.set(x, "inputWidget", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSelected(value: js.Array[Any]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: Any*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setTagLimit(value: Double): Self = StObject.set(x, "tagLimit", value.asInstanceOf[js.Any])
      
      inline def setTagLimitUndefined: Self = StObject.set(x, "tagLimit", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[TagMultiselectWidget]
       with Instantiable1[/* config */ ConfigOptions, TagMultiselectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.forwards
    - typings.oojsUi.oojsUiStrings.backwards
  */
  trait Direction extends StObject
  object Direction {
    
    inline def backwards: typings.oojsUi.oojsUiStrings.backwards = "backwards".asInstanceOf[typings.oojsUi.oojsUiStrings.backwards]
    
    inline def forwards: typings.oojsUi.oojsUiStrings.forwards = "forwards".asInstanceOf[typings.oojsUi.oojsUiStrings.forwards]
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.DraggableGroupElement.EventMap
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.EventMap
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      clear: js.Array[Any],
      disable: js.Array[/* disabled */ Boolean],
      drag: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]],
      draggable: js.Array[/* draggable */ js.UndefOr[Boolean]],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      remove: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      reorder: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.GroupElement.Props
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props {
    
    @JSName("$content")
    var $content: JQuery[HTMLElement]
    
    @JSName("$handle")
    var $handle: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $content: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $group: JQuery[HTMLElement],
      $handle: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($content = $content.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $handle = $handle.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$content(value: JQuery[HTMLElement]): Self = StObject.set(x, "$content", value.asInstanceOf[js.Any])
      
      inline def set$handle(value: JQuery[HTMLElement]): Self = StObject.set(x, "$handle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.DraggableGroupElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype {
    
    /**
      * Add a value to the allowed values list
      *
      * @param value Allowed data value
      */
    def addAllowedValue(value: Any): Unit = js.native
    
    /**
      * Add tag to the display area.
      *
      * Performs a validation check on the tag to be added.
      *
      * @param data Tag data
      * @param label Tag label. If no label is provided, the
      *  stringified version of the data will be used instead.
      * @return Item was added successfully
      */
    def addTag(data: Any, label: String): Boolean = js.native
    def addTag(data: Any, label: JQuery[HTMLElement]): Boolean = js.native
    
    /**
      * Add tag from input value
      */
    def addTagFromInput(): Unit = js.native
    
    /**
      * Check whether all items in the widget are valid
      *
      * @return Widget is valid
      */
    def checkValidity(): Boolean = js.native
    
    /**
      * Clear the input
      */
    def clearInput(): Unit = js.native
    
    /**
      * Perform an action after the Left/Right arrow key on the input, select the previous
      * item from the input.
      * See getPreviousItem
      *
      * @param e Event data
      * @param direction Direction of the movement; forwards or backwards
      * @param withMetaKey Whether this key was pressed with a meta key like Control
      */
    def doInputArrow(e: Event, direction: typings.oojsUi.OO.ui.TagMultiselectWidget.Direction): Unit = js.native
    def doInputArrow(e: Event, direction: typings.oojsUi.OO.ui.TagMultiselectWidget.Direction, withMetaKey: Boolean): Unit = js.native
    
    /**
      * Perform an action responding to the Backspace key on the input
      *
      * @param e Event data
      * @param withMetaKey Whether this key was pressed with
      * a meta key like Control
      * @return Whether to prevent defaults
      */
    def doInputBackspace(e: Event): Boolean = js.native
    def doInputBackspace(e: Event, withMetaKey: Boolean): Boolean = js.native
    
    /**
      * Perform an action after the Enter key on the input
      *
      * @param e Event data
      * @param withMetaKey Whether this key was pressed with
      * a meta key like Control
      * @return Whether to prevent defaults
      */
    def doInputEnter(e: Event): Boolean = js.native
    def doInputEnter(e: Event, withMetaKey: Boolean): Boolean = js.native
    
    /**
      * Perform an action after the Escape key on the input
      *
      * @param e Event data
      */
    def doInputEscape(e: Event): Unit = js.native
    
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
    def emitThrow_drag(
      event: drag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_draggable(
      event: draggable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* draggable */ js.UndefOr[Boolean]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
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
    def emitThrow_reorder(
      event: reorder,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]
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
    def emit_drag(
      event: drag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_draggable(
      event: draggable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* draggable */ js.UndefOr[Boolean]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
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
    def emit_reorder(
      event: reorder,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]]
    ): Boolean = js.native
    
    /**
      * Get the allowed values list
      *
      * @return Allowed data values
      */
    def getAllowedValues(): js.Array[Any] = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Get data and label for a new tag from the input value
      *
      * @return The data and label for a tag
      */
    def getTagInfoFromInput(): TagInfo = js.native
    
    /**
      * Get the datas of the currently selected items
      *
      * @return Datas of currently selected items
      */
    def getValue(): js.Array[Any] = js.native
    
    /**
      * Check whether a given value is allowed to be added
      *
      * @param data Requested value
      * @return Value is allowed
      */
    def isAllowedData(data: Any): Boolean = js.native
    
    /**
      * Check whether the given value is a duplicate of an existing
      * tag already in the list.
      *
      * @param data Requested value
      * @return Value is duplicate
      */
    def isDuplicateData(data: Any): Boolean = js.native
    
    /**
      * Check whether the number of current tags is within the limit.
      *
      * @return True if current tag count is within the limit or
      *  if 'tagLimit' is not set
      */
    def isUnderLimit(): Boolean = js.native
    
    /**
      * Get the current valid state of the widget
      *
      * @return Widget is valid
      */
    def isValid(): Boolean = js.native
    
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
    def off_drag[C](event: drag): this.type = js.native
    @JSName("off")
    def off_drag[C](event: drag, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_drag[C](
      event: drag,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_drag[C](
      event: drag,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_draggable[C](event: draggable): this.type = js.native
    @JSName("off")
    def off_draggable[C](event: draggable, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_draggable[C](
      event: draggable,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* draggable */ js.UndefOr[Boolean]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_draggable[C](
      event: draggable,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* draggable */ js.UndefOr[Boolean]], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_flag[C](event: flag): this.type = js.native
    @JSName("off")
    def off_flag[C](event: flag, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
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
    def off_reorder[C](event: reorder): this.type = js.native
    @JSName("off")
    def off_reorder[C](event: reorder, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_reorder[C](
      event: reorder,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_reorder[C](
      event: reorder,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    
    /**
      * Respond to change event, where items were added, removed, or cleared.
      */
    def onChangeTags(): Unit = js.native
    
    /**
      * Respond to input blur event
      */
    def onInputBlur(): Unit = js.native
    
    /**
      * Respond to input focus event
      */
    def onInputFocus(): Unit = js.native
    
    /**
      * Respond to item fixed state change
      *
      * @param item Selected item
      */
    def onTagFixed(item: TagItemWidget): Unit = js.native
    
    /**
      * Respond to navigate event on the tag
      *
      * @param item Removed tag
      * @param direction Direction of movement; 'forwards' or 'backwards'
      */
    def onTagNavigate(item: TagItemWidget, direction: typings.oojsUi.OO.ui.TagMultiselectWidget.Direction): Unit = js.native
    
    /**
      * Respond to tag remove event
      *
      * @param item Removed tag
      */
    def onTagRemove(item: TagItemWidget): Unit = js.native
    
    /**
      * Respond to item select event
      *
      * @param item Selected item
      */
    def onTagSelect(item: TagItemWidget): Unit = js.native
    
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
    def on_drag[A /* <: ArgTuple */, C](
      event: drag,
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
    def on_drag[A /* <: ArgTuple */, C](
      event: drag,
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
    def on_drag[A /* <: ArgTuple */, C](
      event: drag,
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
    def on_drag[A /* <: ArgTuple */, C](
      event: drag,
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
    def on_draggable[A /* <: ArgTuple */, C](
      event: draggable,
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
    def on_draggable[A /* <: ArgTuple */, C](
      event: draggable,
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
    def on_draggable[A /* <: ArgTuple */, C](
      event: draggable,
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
    def on_draggable[A /* <: ArgTuple */, C](
      event: draggable,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_reorder[A /* <: ArgTuple */, C](
      event: reorder,
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
    def on_reorder[A /* <: ArgTuple */, C](
      event: reorder,
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
    def on_reorder[A /* <: ArgTuple */, C](
      event: reorder,
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
    def on_reorder[A /* <: ArgTuple */, C](
      event: reorder,
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
    def once_drag(
      event: drag,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_draggable(
      event: draggable,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* draggable */ js.UndefOr[Boolean]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_flag(
      event: flag,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
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
    def once_remove(
      event: remove,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_reorder(
      event: reorder,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ DraggableElement, /* newIndex */ js.UndefOr[Double]], 
          Unit
        ]
    ): this.type = js.native
    
    /**
      * Remove tag by its data property.
      *
      * @param data Tag data
      */
    def removeTagByData(data: Any): Unit = js.native
    
    def setValue(valueObject: String): Unit = js.native
    def setValue(valueObject: js.Array[String | ValueMap]): Unit = js.native
    /**
      * Set the value of this widget by datas.
      *
      * @param valueObject An object representing the data
      *  and label of the value. If the widget allows arbitrary values,
      *  the items will be added as-is. Otherwise, the data value will
      *  be checked against allowedValues.
      *  This object must contain at least a data key. Example:
      *  ```
      *      { data: 'foo', label: 'Foo item' }
      *  ```
      *  For multiple items, use an array of objects. For example:
      *  ```
      *      [ { data: 'foo', label: 'Foo item' }, { data: 'bar', label: 'Bar item' } ]
      *  ```
      *  Value can also be added with plaintext array, for example:
      *  ```
      *      [ 'foo', 'bar', 'bla' ]
      *  ```
      *  or a single string, like `'foo'`
      */
    def setValue(valueObject: ValueMap): Unit = js.native
    
    /**
      * Set the valid state of this item
      *
      * @param valid Item is valid, omit to toggle
      */
    def toggleValid(): Unit = js.native
    def toggleValid(valid: Boolean): Unit = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static {
    
    /**
      * Allowed input positions.
      * - inline: The input is inside the tag list
      * - outline: The input is under the tag list
      * - none: There is no input
      */
    var allowedInputPositions: js.Array[String] = js.native
  }
  
  trait TagInfo extends StObject {
    
    var data: String
    
    var label: String
  }
  object TagInfo {
    
    inline def apply(data: String, label: String): TagInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagInfo] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueMap extends StObject {
    
    var data: Any
    
    var label: String
  }
  object ValueMap {
    
    inline def apply(data: Any, label: String): ValueMap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueMap] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
