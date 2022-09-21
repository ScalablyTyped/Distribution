package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.dateRangeInputMod.InnerDateRangeInputProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typings.orbitUiReactComponents.srcDateInputMod.InnerDateInputProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateInputSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", "DateInput")
  @js.native
  val DateInput: OrbitComponent[input, InnerDateInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", "DateRangeInput")
  @js.native
  val DateRangeInput: OrbitComponent[HTMLElement, InnerDateRangeInputProps] = js.native
  
  inline def InnerDateInput(
    hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest: InnerDateInputProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateInput")(hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDateRangeInput(props: InnerDateRangeInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateRangeInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
