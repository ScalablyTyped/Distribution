package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.`1`
import typings.orbitUiReactComponents.distOverlaySrcUseOverlayLightDismissMod.UseOverlayLightDismissOptions
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUsePopupLightDismissMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/usePopupLightDismiss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePopupLightDismiss(triggerRef: RefObject[HTMLElement], overlayRef: RefObject[HTMLElement]): `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopupLightDismiss")(triggerRef.asInstanceOf[js.Any], overlayRef.asInstanceOf[js.Any])).asInstanceOf[`1`]
  inline def usePopupLightDismiss(
    triggerRef: RefObject[HTMLElement],
    overlayRef: RefObject[HTMLElement],
    param2: UseOverlayLightDismissOptions
  ): `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopupLightDismiss")(triggerRef.asInstanceOf[js.Any], overlayRef.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[`1`]
}
