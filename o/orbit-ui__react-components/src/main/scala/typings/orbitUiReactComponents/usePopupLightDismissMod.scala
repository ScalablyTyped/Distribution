package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.`1`
import typings.orbitUiReactComponents.useOverlayLightDismissMod.UseOverlayLightDismissOptions
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePopupLightDismissMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/usePopupLightDismiss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePopupLightDismiss(triggerRef: RefObject[HTMLElement], overlayRef: RefObject[HTMLElement]): `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopupLightDismiss")(triggerRef.asInstanceOf[js.Any], overlayRef.asInstanceOf[js.Any])).asInstanceOf[`1`]
  inline def usePopupLightDismiss(
    triggerRef: RefObject[HTMLElement],
    overlayRef: RefObject[HTMLElement],
    hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick: UseOverlayLightDismissOptions
  ): `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopupLightDismiss")(triggerRef.asInstanceOf[js.Any], overlayRef.asInstanceOf[js.Any], hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick.asInstanceOf[js.Any])).asInstanceOf[`1`]
}
