package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typings.orbitUiReactComponents.passwordInputMod.InnerPasswordInputProps
import typings.orbitUiReactComponents.searchInputMod.InnerSearchInputProps
import typings.orbitUiReactComponents.srcTextInputMod.InnerTextInputProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPasswordInput(props: InnerPasswordInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPasswordInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSearchInput(props: InnerSearchInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSearchInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextInput(props: InnerTextInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-input", "PasswordInput")
  @js.native
  val PasswordInput: OrbitComponent[input, InnerPasswordInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/text-input", "SearchInput")
  @js.native
  val SearchInput: OrbitComponent[input, InnerSearchInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/text-input", "TextInput")
  @js.native
  val TextInput: OrbitComponent[input, InnerTextInputProps] = js.native
}
