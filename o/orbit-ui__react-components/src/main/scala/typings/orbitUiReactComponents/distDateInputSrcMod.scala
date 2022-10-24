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

object distDateInputSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", "DateInput")
  @js.native
  val DateInput: OrbitComponent[input, InnerDateInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src", "DateRangeInput")
  @js.native
  val DateRangeInput: OrbitComponent[HTMLElement, InnerDateRangeInputProps] = js.native
  
  inline def InnerDateInput(param0: InnerDateInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateInput")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDateRangeInput(props: InnerDateRangeInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateRangeInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
