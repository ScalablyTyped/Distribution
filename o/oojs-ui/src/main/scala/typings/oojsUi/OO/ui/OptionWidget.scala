package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.OptionWidget.Props
import typings.oojsUi.OO.ui.OptionWidget.Prototype
import typings.oojsUi.oojsUiStrings.flag
import typings.oojsUi.oojsUiStrings.labelChange
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OptionWidgets are special elements that can be selected and configured with data. The
  * data is often unique for each option, but it does not have to be. OptionWidgets are used
  * with OO.ui.SelectWidget to create a selection of mutually exclusive options. For more information
  * and examples, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options).
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.OptionWidget
  */
@js.native
trait OptionWidget
  extends StObject
     with Props
     with Prototype
object OptionWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[OptionWidget]
       with Instantiable1[/* config */ ConfigOptions, OptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.EventMap
  object EventMap {
    
    inline def apply(
      disable: js.Array[/* disabled */ Boolean],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      labelChange: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    /**
      * Get text to match search strings against.
      *
      * The default implementation returns the label text, but subclasses
      * can override this to provide more complex behavior.
      *
      * @return String to match search string against
      */
    def getMatchText(): String | Boolean = js.native
    
    /**
      * Check if the option can be highlighted. A highlight indicates that the option
      * may be selected when a user presses Enter key or clicks. Disabled items cannot
      * be highlighted.
      *
      * @return Item is highlightable
      */
    def isHighlightable(): Boolean = js.native
    
    /**
      * Check if the option is highlighted. A highlight indicates that the
      * item may be selected when a user presses Enter key or clicks.
      *
      * @return Item is highlighted
      */
    def isHighlighted(): Boolean = js.native
    
    /**
      * Check if the option can be pressed. The pressed state occurs when a user mouses
      * down on an item, but has not yet let go of the mouse.
      *
      * @return Item is pressable
      */
    def isPressable(): Boolean = js.native
    
    /**
      * Check if the option is pressed. The pressed state occurs when a user mouses
      * down on an item, but has not yet let go of the mouse. The item may appear
      * selected, but it will not be selected until the user releases the mouse.
      *
      * @return Item is pressed
      */
    def isPressed(): Boolean = js.native
    
    /**
      * Check if the option can be selected.
      *
      * @return Item is selectable
      */
    def isSelectable(): Boolean = js.native
    
    /**
      * Check if the option is selected.
      *
      * @return Item is selected
      */
    def isSelected(): Boolean = js.native
    
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
    def off_labelChange[C](event: labelChange): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def once_flag(
      event: flag,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    
    /**
      * Set the option’s highlighted state. In general, all programmatic
      * modifications to the highlight should be handled by the
      * SelectWidget’s {@link OO.ui.SelectWidget.highlightItem highlightItem( [item] )}
      * method instead of this method.
      *
      * @param state Highlight option
      * @return The widget, for chaining
      */
    def setHighlighted(): this.type = js.native
    def setHighlighted(state: Boolean): this.type = js.native
    
    /**
      * Set the option’s pressed state. In general, all
      * programmatic modifications to the pressed state should be handled by the
      * SelectWidget’s {@link OO.ui.SelectWidget.pressItem pressItem( [item] )}
      * method instead of this method.
      *
      * @param state Press option
      * @return The widget, for chaining
      */
    def setPressed(): this.type = js.native
    def setPressed(state: Boolean): this.type = js.native
    
    /**
      * Set the option’s selected state. In general, all modifications to the selection
      * should be handled by the SelectWidget’s
      * {@link OO.ui.SelectWidget.selectItem selectItem( [item] )} method instead of this method.
      *
      * @param state Select option
      * @return The widget, for chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(state: Boolean): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Static
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static {
    
    /** Whether this option can be highlighted. See {@link Prototype.setHighlighted setHighlighted}. */
    var highlightable: Boolean = js.native
    
    /** Whether this option can be pressed. See {@link Prototype.setPressed setPressed}. */
    var pressable: Boolean = js.native
    
    /** Whether this option will be scrolled into view when it is selected. */
    var scrollIntoViewOnSelect: Boolean = js.native
    
    /** Whether this option can be selected. See {@link Prototype.setSelected setSelected}. */
    var selectable: Boolean = js.native
  }
}
