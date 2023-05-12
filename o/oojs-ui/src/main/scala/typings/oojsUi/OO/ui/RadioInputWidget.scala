package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.RadioInputWidget.Props
import typings.oojsUi.OO.ui.RadioInputWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RadioInputWidget creates a single radio button. Because radio buttons are usually used as a set,
  * in most cases you will want to use a {@link OO.ui.RadioSelectWidget radio select}
  * with {@link OO.ui.RadioOptionWidget radio options} instead of this class. For more information,
  * please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs).
  *
  * This widget can be used inside an HTML form, such as a OO.ui.FormLayout.
  *
  *     // An example of selected, unselected, and disabled radio inputs
  *     var radio1 = new OO.ui.RadioInputWidget( {
  *         value: 'a',
  *         selected: true
  *     } );
  *     var radio2 = new OO.ui.RadioInputWidget( {
  *         value: 'b'
  *     } );
  *     var radio3 = new OO.ui.RadioInputWidget( {
  *         value: 'c',
  *         disabled: true
  *     } );
  *     // Create a fieldset layout with fields for each radio button.
  *     var fieldset = new OO.ui.FieldsetLayout( {
  *         label: 'Radio inputs'
  *     } );
  *     fieldset.addItems( [
  *         new OO.ui.FieldLayout( radio1, { label: 'Selected', align: 'inline' } ),
  *         new OO.ui.FieldLayout( radio2, { label: 'Unselected', align: 'inline' } ),
  *         new OO.ui.FieldLayout( radio3, { label: 'Disabled', align: 'inline' } ),
  *     ] );
  *     $( document.body ).append( fieldset.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.RadioInputWidget
  */
@js.native
trait RadioInputWidget
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
object RadioInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.RequiredElement.ConfigOptions {
    
    /** Select the radio button initially. By default, the radio button is not selected. */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[RadioInputWidget]
       with Instantiable1[/* config */ ConfigOptions, RadioInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Props
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $input: JQuery[HTMLElement],
      $required: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $input = $input.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Prototype {
    
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
      * Check if this radio button is selected.
      *
      * @return Radio is selected
      */
    def isSelected(): Boolean = js.native
    
    /**
      * Set selection state of this radio button.
      *
      * @param state `true` for selected
      * @return The widget, for chaining
      */
    def setSelected(state: Boolean): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.InputWidget.Static
}
