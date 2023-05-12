package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Numberish
import typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props
import typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TabIndexedElement class is an attribute mixin used to add additional functionality to an
  * element created by another class. The mixin provides a ‘tabIndex’ property, which specifies the
  * order in which users will navigate through the focusable elements via the Tab key.
  *
  *     // TabIndexedElement is mixed into the ButtonWidget class
  *     // to provide a tabIndex property.
  *     var button1 = new OO.ui.ButtonWidget( {
  *             label: 'fourth',
  *             tabIndex: 4
  *         } ),
  *         button2 = new OO.ui.ButtonWidget( {
  *             label: 'second',
  *             tabIndex: 2
  *         } ),
  *         button3 = new OO.ui.ButtonWidget( {
  *             label: 'third',
  *             tabIndex: 3
  *         } ),
  *         button4 = new OO.ui.ButtonWidget( {
  *             label: 'first',
  *             tabIndex: 1
  *         } );
  *     $( document.body ).append(
  *         button1.$element,
  *         button2.$element,
  *         button3.$element,
  *         button4.$element
  *      );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.TabIndexedElement
  */
@js.native
trait TabIndexedElement
  extends StObject
     with Props
     with Prototype
object TabIndexedElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The element that should use the tabindex functionality. By default,
      * the functionality is applied to the element created by the class ({@link Element.Props.$element $element}).
      * If a different element is specified, the tabindex functionality will be applied to it instead.
      */
    @JSName("$tabIndexed")
    var $tabIndexed: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Number that specifies the element’s position in the
      * tab-navigation order (e.g., 1 for the first focusable element). Use 0 to use the default
      * navigation order; use -1 to remove the element from the tab-navigation flow.
      */
    var tabIndex: js.UndefOr[Numberish | Null] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$tabIndexed(value: JQuery[HTMLElement]): Self = StObject.set(x, "$tabIndexed", value.asInstanceOf[js.Any])
      
      inline def set$tabIndexedUndefined: Self = StObject.set(x, "$tabIndexed", js.undefined)
      
      inline def setTabIndex(value: Numberish): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexNull: Self = StObject.set(x, "tabIndex", null)
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[TabIndexedElement]
       with Instantiable1[/* config */ ConfigOptions, TabIndexedElement]
  
  trait Props extends StObject {
    
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($tabIndexed: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($tabIndexed = $tabIndexed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$tabIndexed(value: JQuery[HTMLElement]): Self = StObject.set(x, "$tabIndexed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Blur this element.
      *
      * @return The element, for chaining
      */
    def blur(): this.type = js.native
    
    /**
      * Focus this element.
      *
      * @return The element, for chaining
      */
    def focus(): this.type = js.native
    
    /**
      * Get an ID of a focusable element of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If the element already has an ID then that is returned, otherwise unique ID is
      * generated, set on the element, and returned.
      *
      * @return The ID of the focusable element
      */
    def getInputId(): String | Null = js.native
    
    /**
      * Get the value of the tabindex.
      *
      * @return Tabindex value
      */
    def getTabIndex(): Double | Null = js.native
    
    /**
      * Set the value of the tabindex.
      *
      * @param tabIndex Tabindex value, or `null` for no tabindex
      * @return The element, for chaining
      */
    def setTabIndex(): this.type = js.native
    def setTabIndex(tabIndex: Numberish): this.type = js.native
    
    /**
      * Set the element that should use the tabindex functionality.
      *
      * This method is used to retarget a tabindex mixin so that its functionality applies
      * to the specified element. If an element is currently using the functionality, the
      * mixin’s effect on that element is removed before the new element is set up.
      *
      * @param $tabIndexed Element that should use the tabindex functionality
      * @return The element, for chaining
      */
    def setTabIndexedElement($tabIndexed: JQuery[HTMLElement]): this.type = js.native
  }
}
