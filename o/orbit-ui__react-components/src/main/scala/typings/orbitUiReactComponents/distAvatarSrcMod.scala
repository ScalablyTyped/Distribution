package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distAvatarSrcAvatarGroupMod.InnerAvatarGroupProps
import typings.orbitUiReactComponents.distAvatarSrcAvatarMod.AvatarTextProps
import typings.orbitUiReactComponents.distAvatarSrcAvatarMod.InnerAvatarProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAvatarSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/avatar/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/avatar/src", "Avatar")
  @js.native
  val Avatar: OrbitComponent[HTMLElement, InnerAvatarProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/avatar/src", "AvatarGroup")
  @js.native
  val AvatarGroup: OrbitComponent[HTMLElement, InnerAvatarGroupProps] = js.native
  
  inline def AvatarText(props: AvatarTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAvatar(param0: InnerAvatarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAvatar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAvatarGroup(param0: InnerAvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAvatarGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
