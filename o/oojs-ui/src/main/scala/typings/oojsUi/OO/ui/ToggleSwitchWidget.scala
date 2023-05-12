package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ToggleSwitchWidget.Props
import typings.oojsUi.OO.ui.ToggleSwitchWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ToggleSwitches are switches that slide on and off. Their state is represented by a Boolean
  * value (`true` for ‘on’, and `false` otherwise, the default). The ‘off’ state is represented
  * visually by a slider in the leftmost position.
  *
  *     // Toggle switches in the 'off' and 'on' position.
  *     var toggleSwitch1 = new OO.ui.ToggleSwitchWidget(),
  *         toggleSwitch2 = new OO.ui.ToggleSwitchWidget( {
  *             value: true
  *         } );
  *         // Create a FieldsetLayout to layout and label switches.
  *         fieldset = new OO.ui.FieldsetLayout( {
  *             label: 'Toggle switches'
  *         } );
  *     fieldset.addItems( [
  *         new OO.ui.FieldLayout( toggleSwitch1, {
  *             label: 'Off',
  *             align: 'top'
  *         } ),
  *         new OO.ui.FieldLayout( toggleSwitch2, {
  *             label: 'On',
  *             align: 'top'
  *         } )
  *     ] );
  *     $( document.body ).append( fieldset.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ToggleSwitchWidget
  */
@js.native
trait ToggleSwitchWidget
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
object ToggleSwitchWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.ToggleWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions
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
  Instantiable0[ToggleSwitchWidget]
       with Instantiable1[/* config */ ConfigOptions, ToggleSwitchWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.ToggleWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.ToggleWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.ToggleWidget.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props {
    
    @JSName("$glow")
    var $glow: JQuery[HTMLElement]
    
    @JSName("$grip")
    var $grip: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $element: JQuery[HTMLElement],
      $glow: JQuery[HTMLElement],
      $grip: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $glow = $glow.asInstanceOf[js.Any], $grip = $grip.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$glow(value: JQuery[HTMLElement]): Self = StObject.set(x, "$glow", value.asInstanceOf[js.Any])
      
      inline def set$grip(value: JQuery[HTMLElement]): Self = StObject.set(x, "$grip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.ToggleWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype {
    
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
  
  type Static = typings.oojsUi.OO.ui.ToggleWidget.Static
}
