package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Size
import typings.orbitUiReactComponents.buttonGroupMod.InnerButtonGroupProps
import typings.orbitUiReactComponents.crossButtonMod.InnerCrossButtonProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.iconButtonMod.InnerIconButtonProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.button
import typings.orbitUiReactComponents.srcButtonMod.InnerButtonProps
import typings.orbitUiReactComponents.toggleButtonMod.InnerToggleButtonProps
import typings.orbitUiReactComponents.toggleIconButtonMod.InnerToggleIconButtonProps
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/button/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button/src", "Button")
  @js.native
  val Button: OrbitComponent[button, InnerButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button/src", "ButtonGroup")
  @js.native
  val ButtonGroup: OrbitComponent[HTMLElement, InnerButtonGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button/src", "CrossButton")
  @js.native
  val CrossButton: OrbitComponent[button, InnerCrossButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button/src", "IconButton")
  @js.native
  val IconButton: OrbitComponent[button, InnerIconButtonProps] = js.native
  
  inline def InnerButton(props: InnerButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerButtonGroup(props: InnerButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCrossButton(hasForwardedRefRest: InnerCrossButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCrossButton")(hasForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerIconButton(props: InnerIconButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIconButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToggleButton(props: InnerToggleButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToggleButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToggleIconButton(props: InnerToggleIconButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToggleIconButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/button/src", "ToggleButton")
  @js.native
  val ToggleButton: OrbitComponent[button, InnerToggleButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button/src", "ToggleIconButton")
  @js.native
  val ToggleIconButton: OrbitComponent[button, InnerToggleIconButtonProps] = js.native
  
  inline def embedIconButton[Props /* <: Size & (Record[String, Any]) */](element: ReactElement, hasSizeProps: Props): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embedIconButton")(element.asInstanceOf[js.Any], hasSizeProps.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
}
