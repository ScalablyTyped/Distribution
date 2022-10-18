package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Ariachecked
import typings.orbitUiReactComponents.anon.ClassName
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.react.mod.ChangeEvent
import typings.react.mod.ForwardedRef
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckboxSrcUseCheckboxMod {
  
  @JSImport("@orbit-ui/react-components/dist/checkbox/src/useCheckbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCheckbox(
    hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef: UseCheckboxProps
  ): UseCheckboxReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckbox")(hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef.asInstanceOf[js.Any]).asInstanceOf[UseCheckboxReturn]
  
  trait UseCheckboxProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    var checked: js.UndefOr[Boolean | Null] = js.undefined
    
    var cssModule: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var forwardedRef: js.UndefOr[ForwardedRef[Any]] = js.undefined
    
    var hover: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var indeterminate: js.UndefOr[Boolean | Null] = js.undefined
    
    var isInField: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* isChecked */ Boolean, Unit]
      ] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[sm | md] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var validationState: js.UndefOr[invalid | valid] = js.undefined
  }
  object UseCheckboxProps {
    
    inline def apply(): UseCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseCheckboxProps]
    }
    
    extension [Self <: UseCheckboxProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedNull: Self = StObject.set(x, "checked", null)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCssModule(value: String): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateNull: Self = StObject.set(x, "indeterminate", null)
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setIsInField(value: Boolean): Self = StObject.set(x, "isInField", value.asInstanceOf[js.Any])
      
      inline def setIsInFieldUndefined: Self = StObject.set(x, "isInField", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* isChecked */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValidationState(value: invalid | valid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  trait UseCheckboxReturn extends StObject {
    
    var inputProps: Ariachecked
    
    var isChecked: Boolean
    
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    var wrapperProps: ClassName
  }
  object UseCheckboxReturn {
    
    inline def apply(inputProps: Ariachecked, isChecked: Boolean, wrapperProps: ClassName): UseCheckboxReturn = {
      val __obj = js.Dynamic.literal(inputProps = inputProps.asInstanceOf[js.Any], isChecked = isChecked.asInstanceOf[js.Any], wrapperProps = wrapperProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseCheckboxReturn]
    }
    
    extension [Self <: UseCheckboxReturn](x: Self) {
      
      inline def setInputProps(value: Ariachecked): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
      
      inline def setWrapperProps(value: ClassName): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
    }
  }
}
