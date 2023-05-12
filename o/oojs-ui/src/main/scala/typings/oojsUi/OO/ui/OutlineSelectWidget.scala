package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.OutlineSelectWidget.Props
import typings.oojsUi.OO.ui.OutlineSelectWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OutlineSelectWidget is a structured list that contains
  * {@link OO.ui.OutlineOptionWidget outline options}
  * A set of controls can be provided with an {@link OO.ui.OutlineControlsWidget outline controls}
  * widget.
  *
  * **Currently, this class is only used by {@link OO.ui.BookletLayout booklet layouts}.**
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.OutlineSelectWidget
  */
@js.native
trait OutlineSelectWidget
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
object OutlineSelectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.ConfigOptions
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
  Instantiable0[OutlineSelectWidget]
       with Instantiable1[/* config */ ConfigOptions, OutlineSelectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.SelectWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.SelectWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props
  object Props {
    
    inline def apply(
      $element: JQuery[HTMLElement],
      $focusOwner: JQuery[HTMLElement],
      $group: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $focusOwner = $focusOwner.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.Prototype
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
  
  type Static = typings.oojsUi.OO.ui.SelectWidget.Static
}
