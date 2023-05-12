package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.oojsUi.OO.ui.CheckboxMultiselectWidget.Props
import typings.oojsUi.OO.ui.CheckboxMultiselectWidget.Prototype
import typings.oojsUi.oojsUiInts.`-1`
import typings.oojsUi.oojsUiInts.`1`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckboxMultiselectWidget is a {@link OO.ui.MultiselectWidget multiselect widget} that contains
  * checkboxes and is used together with OO.ui.CheckboxMultioptionWidget. The
  * CheckboxMultiselectWidget provides an interface for adding, removing and selecting options.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options)
  * for more information.
  *
  * If you want to use this within an HTML form, such as a OO.ui.FormLayout, use
  * OO.ui.CheckboxMultiselectInputWidget instead.
  *
  *     // A CheckboxMultiselectWidget with CheckboxMultioptions.
  *     var option1 = new OO.ui.CheckboxMultioptionWidget( {
  *             data: 'a',
  *             selected: true,
  *             label: 'Selected checkbox'
  *         } ),
  *         option2 = new OO.ui.CheckboxMultioptionWidget( {
  *             data: 'b',
  *             label: 'Unselected checkbox'
  *         } ),
  *         multiselect = new OO.ui.CheckboxMultiselectWidget( {
  *             items: [ option1, option2 ]
  *         } );
  *     $( document.body ).append( multiselect.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.CheckboxMultiselectWidget
  */
@js.native
trait CheckboxMultiselectWidget
  extends StObject
     with Props
     with Prototype
object CheckboxMultiselectWidget {
  
  type ConfigOptions = typings.oojsUi.OO.ui.MultiselectWidget.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[CheckboxMultiselectWidget]
       with Instantiable1[/* config */ ConfigOptions, CheckboxMultiselectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.MultiselectWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.MultiselectWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.MultiselectWidget.Props {
    
    @JSName("$lastClicked")
    var $lastClicked: JQuery[HTMLElement] | Null
  }
  object Props {
    
    inline def apply($element: JQuery[HTMLElement], $group: JQuery[HTMLElement], $titled: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any], $lastClicked = null)
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$lastClicked(value: JQuery[HTMLElement]): Self = StObject.set(x, "$lastClicked", value.asInstanceOf[js.Any])
      
      inline def set$lastClickedNull: Self = StObject.set(x, "$lastClicked", null)
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.MultiselectWidget.Prototype {
    
    /**
      * Focus the widget
      *
      * @return The widget, for chaining
      */
    def focus(): this.type = js.native
    
    def getRelativeFocusableItem(item: Null, direction: `1` | `-1`): CheckboxMultioptionWidget | Null = js.native
    /**
      * Get an option by its position relative to the specified item (or to the start of the
      * option array, if item is `null`). The direction in which to search through the option
      * array is specified with a number: -1 for reverse (the default) or 1 for forward. The
      * method will return an option, or `null` if there are no options in the array.
      *
      * @param item Item to describe the start position, or `null` to start at the beginning
      *   of the array.
      * @param direction Direction to move in: -1 to move backward, 1 to move forward
      * @return Item at position, `null` if there are no items in the select.
      */
    def getRelativeFocusableItem(item: CheckboxMultioptionWidget, direction: `1` | `-1`): CheckboxMultioptionWidget | Null = js.native
    
    /**
      * Handle click events on checkboxes.
      *
      * @param e jQuery.Event
      */
    def onClick(e: Event): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.MultiselectWidget.Static
}
