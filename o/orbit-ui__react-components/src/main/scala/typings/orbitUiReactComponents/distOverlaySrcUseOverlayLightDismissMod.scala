package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distOverlaySrcUseOverlayTriggerMod.OverlayTrigger
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUseOverlayLightDismissMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useOverlayLightDismiss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOverlayLightDismiss(overlayRef: RefObject[HTMLElement]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def useOverlayLightDismiss(
    overlayRef: RefObject[HTMLElement],
    hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick: UseOverlayLightDismissOptions
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any], hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait UseOverlayLightDismissOptions extends StObject {
    
    var hideOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var hideOnLeave: js.UndefOr[Boolean] = js.undefined
    
    var hideOnOutsideClick: js.UndefOr[
        Boolean | (js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit])
      ] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var trigger: js.UndefOr[OverlayTrigger] = js.undefined
  }
  object UseOverlayLightDismissOptions {
    
    inline def apply(): UseOverlayLightDismissOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseOverlayLightDismissOptions]
    }
    
    extension [Self <: UseOverlayLightDismissOptions](x: Self) {
      
      inline def setHideOnEscape(value: Boolean): Self = StObject.set(x, "hideOnEscape", value.asInstanceOf[js.Any])
      
      inline def setHideOnEscapeUndefined: Self = StObject.set(x, "hideOnEscape", js.undefined)
      
      inline def setHideOnLeave(value: Boolean): Self = StObject.set(x, "hideOnLeave", value.asInstanceOf[js.Any])
      
      inline def setHideOnLeaveUndefined: Self = StObject.set(x, "hideOnLeave", js.undefined)
      
      inline def setHideOnOutsideClick(value: Boolean | (js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit])): Self = StObject.set(x, "hideOnOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnOutsideClickFunction1(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "hideOnOutsideClick", js.Any.fromFunction1(value))
      
      inline def setHideOnOutsideClickUndefined: Self = StObject.set(x, "hideOnOutsideClick", js.undefined)
      
      inline def setOnHide(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setTrigger(value: OverlayTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
