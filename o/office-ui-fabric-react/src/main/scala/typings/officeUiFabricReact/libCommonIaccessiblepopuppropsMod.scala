package typings.officeUiFabricReact

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonIaccessiblepopuppropsMod {
  
  trait IAccessiblePopupProps extends StObject {
    
    /**
      * Aria label on close button.
      */
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the element to focus on when exiting the control's FocusTrapZone.
      * @defaultvalue The `element.target` that triggered the control opening.
      */
    var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Class name (not actual selector) for first focusable item. Do not append a dot.
      */
    var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    /**
      * Whether control should force focus inside its focus trap zone.
      * @defaultvalue true
      */
    var forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If false (the default), the control's FocusTrapZone will restore focus to the element which
      * activated it once the trap zone is unmounted or disabled. Set to true to disable this behavior.
      * @defaultvalue false
      */
    var ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this control will allow clicks outside its FocusTrapZone.
      * @defaultvalue false
      */
    var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined
  }
  object IAccessiblePopupProps {
    
    inline def apply(): IAccessiblePopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAccessiblePopupProps]
    }
    
    extension [Self <: IAccessiblePopupProps](x: Self) {
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setElementToFocusOnDismiss(value: HTMLElement): Self = StObject.set(x, "elementToFocusOnDismiss", value.asInstanceOf[js.Any])
      
      inline def setElementToFocusOnDismissUndefined: Self = StObject.set(x, "elementToFocusOnDismiss", js.undefined)
      
      inline def setFirstFocusableSelector(value: String | js.Function0[String]): Self = StObject.set(x, "firstFocusableSelector", value.asInstanceOf[js.Any])
      
      inline def setFirstFocusableSelectorFunction0(value: () => String): Self = StObject.set(x, "firstFocusableSelector", js.Any.fromFunction0(value))
      
      inline def setFirstFocusableSelectorUndefined: Self = StObject.set(x, "firstFocusableSelector", js.undefined)
      
      inline def setForceFocusInsideTrap(value: Boolean): Self = StObject.set(x, "forceFocusInsideTrap", value.asInstanceOf[js.Any])
      
      inline def setForceFocusInsideTrapUndefined: Self = StObject.set(x, "forceFocusInsideTrap", js.undefined)
      
      inline def setIgnoreExternalFocusing(value: Boolean): Self = StObject.set(x, "ignoreExternalFocusing", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExternalFocusingUndefined: Self = StObject.set(x, "ignoreExternalFocusing", js.undefined)
      
      inline def setIsClickableOutsideFocusTrap(value: Boolean): Self = StObject.set(x, "isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
      
      inline def setIsClickableOutsideFocusTrapUndefined: Self = StObject.set(x, "isClickableOutsideFocusTrap", js.undefined)
    }
  }
}
