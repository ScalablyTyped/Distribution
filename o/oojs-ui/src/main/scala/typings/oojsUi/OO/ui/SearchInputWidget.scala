package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery.Event
import typings.oojsUi.OO.ui.SearchInputWidget.Prototype
import typings.oojsUi.OO.ui.TextInputWidget.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchInputWidgets are TextInputWidgets with `type="search"` assigned and feature a
  * {@link OO.ui.mixin.IconElement 'search' icon} as well as a functional
  * {@link OO.ui.mixin.IndicatorElement 'clear' indicator} by default.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs#SearchInputWidget)
  * for more information and examples.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.SearchInputWidget
  */
@js.native
trait SearchInputWidget
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
object SearchInputWidget {
  
  type ConfigOptions = typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[SearchInputWidget]
       with Instantiable1[/* config */ ConfigOptions, SearchInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.TextInputWidget.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.Prototype {
    
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
      * Clear and focus the input element when clicking on the 'clear' indicator.
      *
      * @param e Click event
      * @return
      */
    def onIndicatorClick(e: Event): Boolean = js.native
    
    /**
      * Clear and focus the input element when pressing enter on the 'clear' indicator.
      *
      * @param e KeyDown event
      * @return
      */
    def onIndicatorKeyDown(e: Event): Boolean = js.native
    
    /**
      * Update the 'clear' indicator displayed on type: 'search' text
      * fields, hiding it when the field is already empty or when it's not
      * editable.
      */
    def updateSearchIndicator(): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.TextInputWidget.Static
}
