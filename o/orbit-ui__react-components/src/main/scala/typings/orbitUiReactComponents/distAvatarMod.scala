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

object distAvatarMod {
  
  @JSImport("@orbit-ui/react-components/dist/avatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/avatar", "Avatar")
  @js.native
  val Avatar: OrbitComponent[HTMLElement, InnerAvatarProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/avatar", "AvatarGroup")
  @js.native
  val AvatarGroup: OrbitComponent[HTMLElement, InnerAvatarGroupProps] = js.native
  
  inline def AvatarText(props: AvatarTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAvatar(hasNameSrcRetryCountSizeAriaLabelAsForwardedRefRest: InnerAvatarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAvatar")(hasNameSrcRetryCountSizeAriaLabelAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAvatarGroup(hasSizeAsChildrenForwardedRefRest: InnerAvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAvatarGroup")(hasSizeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
}
