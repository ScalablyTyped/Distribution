package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distCheckboxSrcCheckboxGroupMod.InnerCheckboxGroupProps
import typings.orbitUiReactComponents.distCheckboxSrcCheckboxMod.InnerCheckboxProps
import typings.orbitUiReactComponents.distCheckboxSrcUseCheckboxMod.UseCheckboxProps
import typings.orbitUiReactComponents.distCheckboxSrcUseCheckboxMod.UseCheckboxReturn
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckboxMod {
  
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
  
  inline def useCheckbox(param0: UseCheckboxProps): UseCheckboxReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckbox")(param0.asInstanceOf[js.Any]).asInstanceOf[UseCheckboxReturn]
}
