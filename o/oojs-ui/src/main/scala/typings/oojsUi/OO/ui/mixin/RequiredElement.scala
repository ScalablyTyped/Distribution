package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Element
import typings.oojsUi.OO.ui.mixin.RequiredElement.Props
import typings.oojsUi.OO.ui.mixin.RequiredElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RequiredElement is mixed into other classes to provide a `required` attribute.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.RequiredElement
  */
trait RequiredElement
  extends StObject
     with Props
     with Prototype
object RequiredElement {
  
  inline def apply(
    $required: JQuery[HTMLElement],
    isRequired: () => Boolean,
    setRequired: Boolean => RequiredElement,
    setRequiredElement: JQuery[HTMLElement] => Unit
  ): RequiredElement = {
    val __obj = js.Dynamic.literal($required = $required.asInstanceOf[js.Any], isRequired = js.Any.fromFunction0(isRequired), setRequired = js.Any.fromFunction1(setRequired), setRequiredElement = js.Any.fromFunction1(setRequiredElement))
    __obj.asInstanceOf[RequiredElement]
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * The element to which the `required` attribute is applied.
      * If this config is omitted, the required functionality is applied to $input if it
      * exists, or {@link Element.Props.$element $element} if it doesn't.
      */
    @JSName("$required")
    var $required: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Element which mixes in OO.ui.mixin.IndicatorElement.
      * Will set the indicator on that element to 'required' when the element is required.
      * Note that `false` & setting `indicator: 'required'` will result in no indicator shown.
      */
    var indicatorElement: js.UndefOr[Element] = js.undefined
    
    /** Mark the field as required with `true`. */
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$required(value: JQuery[HTMLElement]): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
      
      inline def set$requiredUndefined: Self = StObject.set(x, "$required", js.undefined)
      
      inline def setIndicatorElement(value: Element): Self = StObject.set(x, "indicatorElement", value.asInstanceOf[js.Any])
      
      inline def setIndicatorElementUndefined: Self = StObject.set(x, "indicatorElement", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[RequiredElement]
       with Instantiable1[/* config */ ConfigOptions, RequiredElement]
  
  trait Props extends StObject {
    
    @JSName("$required")
    var $required: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($required: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($required = $required.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$required(value: JQuery[HTMLElement]): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prototype extends StObject {
    
    /**
      * Check if the input is {@link ConfigOptions.required required}.
      *
      * @return
      */
    def isRequired(): Boolean
    
    /**
      * Set the {@link ConfigOptions.required required} state of the input.
      *
      * @param state Make input required
      * @return The widget, for chaining
      */
    def setRequired(state: Boolean): this.type
    
    /**
      * Set the element which can take the required attribute.
      *
      * This method is used to retarget a RequiredElement mixin so that its functionality
      * applies to the specified element.
      * If an element is already set, the mixin’s effect on that element is removed before
      * the new element is set up.
      *
      * @param $required Element that should use the 'required' functionality
      */
    def setRequiredElement($required: JQuery[HTMLElement]): Unit
  }
  object Prototype {
    
    inline def apply(
      isRequired: () => Boolean,
      setRequired: Boolean => Prototype,
      setRequiredElement: JQuery[HTMLElement] => Unit
    ): Prototype = {
      val __obj = js.Dynamic.literal(isRequired = js.Any.fromFunction0(isRequired), setRequired = js.Any.fromFunction1(setRequired), setRequiredElement = js.Any.fromFunction1(setRequiredElement))
      __obj.asInstanceOf[Prototype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prototype] (val x: Self) extends AnyVal {
      
      inline def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
      
      inline def setSetRequired(value: Boolean => Prototype): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
      
      inline def setSetRequiredElement(value: JQuery[HTMLElement] => Unit): Self = StObject.set(x, "setRequiredElement", js.Any.fromFunction1(value))
    }
  }
}
