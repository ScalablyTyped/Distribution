package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.checkboxGroupMod.InnerCheckboxGroupProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcCheckboxMod.InnerCheckboxProps
import typings.orbitUiReactComponents.useCheckboxMod.UseCheckboxProps
import typings.orbitUiReactComponents.useCheckboxMod.UseCheckboxReturn
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@orbit-ui/react-components/dist/checkbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/checkbox", "Checkbox")
  @js.native
  val Checkbox: OrbitComponent[HTMLElement, InnerCheckboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/checkbox", "CheckboxGroup")
  @js.native
  val CheckboxGroup: OrbitComponent[HTMLElement, InnerCheckboxGroupProps] = js.native
  
  inline def InnerCheckbox(props: InnerCheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCheckbox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCheckboxGroup(props: InnerCheckboxGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCheckboxGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useCheckbox(
    hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef: UseCheckboxProps
  ): UseCheckboxReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckbox")(hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef.asInstanceOf[js.Any]).asInstanceOf[UseCheckboxReturn]
}
