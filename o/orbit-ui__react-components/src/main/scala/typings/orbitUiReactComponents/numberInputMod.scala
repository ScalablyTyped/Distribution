package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcNumberInputMod.InnerNumberInputProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/number-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerNumberInput(props: InnerNumberInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerNumberInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/number-input", "NumberInput")
  @js.native
  val NumberInput: OrbitComponent[HTMLElement, InnerNumberInputProps] = js.native
}
