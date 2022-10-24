package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.ClearInputGroupContextProps
import typings.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.InputGroupContextType
import typings.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupAddonPropsReturn
import typings.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupButtonAddonPropsReturn
import typings.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupMenuAddonPropsReturn
import typings.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupPropsReturn
import typings.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupSelectAddonPropsReturn
import typings.orbitUiReactComponents.distInputGroupSrcInputGroupMod.InnerInputGroupProps
import typings.orbitUiReactComponents.distInputGroupSrcTextAddonMod.InnerTextAddonProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputGroupSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/input-group/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearInputGroupContext(param0: ClearInputGroupContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearInputGroupContext")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerInputGroup(param0: InnerInputGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerInputGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextAddon(props: InnerTextAddonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/input-group/src", "InputGroup")
  @js.native
  val InputGroup: OrbitComponent[HTMLElement, InnerInputGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/input-group/src", "InputGroupContext")
  @js.native
  val InputGroupContext: Context[InputGroupContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/input-group/src", "TextAddon")
  @js.native
  val TextAddon: OrbitComponent[HTMLElement, InnerTextAddonProps] = js.native
  
  inline def useInputGroupAddonProps(): js.Tuple2[UseInputGroupAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupAddonPropsReturn, Boolean]]
  
  inline def useInputGroupButtonAddonProps(): js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupButtonAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean]]
  
  inline def useInputGroupContext(): js.Tuple2[InputGroupContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupContext")().asInstanceOf[js.Tuple2[InputGroupContextType, Boolean]]
  
  inline def useInputGroupMenuAddonProps(): js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupMenuAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean]]
  
  inline def useInputGroupProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
  
  inline def useInputGroupSelectAddonProps(): js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupSelectAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean]]
  
  inline def useInputGroupTextInputProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupTextInputProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
}
