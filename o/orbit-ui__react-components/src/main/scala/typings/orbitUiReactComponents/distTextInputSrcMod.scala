package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distTextInputSrcPasswordInputMod.InnerPasswordInputProps
import typings.orbitUiReactComponents.distTextInputSrcSearchInputMod.InnerSearchInputProps
import typings.orbitUiReactComponents.distTextInputSrcTextInputMod.InnerTextInputProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextInputSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPasswordInput(props: InnerPasswordInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPasswordInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSearchInput(props: InnerSearchInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSearchInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextInput(props: InnerTextInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", "PasswordInput")
  @js.native
  val PasswordInput: OrbitComponent[input, InnerPasswordInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", "SearchInput")
  @js.native
  val SearchInput: OrbitComponent[input, InnerSearchInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src", "TextInput")
  @js.native
  val TextInput: OrbitComponent[input, InnerTextInputProps] = js.native
}
