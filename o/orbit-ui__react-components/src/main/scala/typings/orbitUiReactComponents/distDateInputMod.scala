package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distDateInputSrcDateInputMod.InnerDateInputProps
import typings.orbitUiReactComponents.distDateInputSrcDateRangeInputMod.InnerDateRangeInputProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input", "DateInput")
  @js.native
  val DateInput: OrbitComponent[input, InnerDateInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input", "DateRangeInput")
  @js.native
  val DateRangeInput: OrbitComponent[HTMLElement, InnerDateRangeInputProps] = js.native
  
  inline def InnerDateInput(
    hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest: InnerDateInputProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateInput")(hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDateRangeInput(props: InnerDateRangeInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateRangeInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
