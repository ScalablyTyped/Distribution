package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.TabSelectWidget.Props
import typings.oojsUi.OO.ui.TabSelectWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TabSelectWidget is a list that contains {@link OO.ui.TabOptionWidget tab options}
  *
  * **Currently, this class is only used by {@link OO.ui.IndexLayout index layouts}.**
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.TabSelectWidget
  */
@js.native
trait TabSelectWidget
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
object TabSelectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions {
    
    /** Use framed tabs */
    var framed: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setFramed(value: Boolean): Self = StObject.set(x, "framed", value.asInstanceOf[js.Any])
      
      inline def setFramedUndefined: Self = StObject.set(x, "framed", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[TabSelectWidget]
       with Instantiable1[/* config */ ConfigOptions, TabSelectWidget] {
    
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
    
    /**
      * Check if tabs are framed.
      *
      * @return Tabs are framed
      */
    def isFramed(): Boolean = js.native
    
    /**
      * Render the tabs with or without frames.
      *
      * @param framed Make tabs framed, omit to toggle
      * @return The element, for chaining
      */
    def toggleFramed(): this.type = js.native
    def toggleFramed(framed: Boolean): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.SelectWidget.Static
}
