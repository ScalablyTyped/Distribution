package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.ArrowProps
import typings.orbitUiReactComponents.distOverlaySrcUseOverlayPositionMod.OverlayPosition
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.click
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.listbox
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.menu
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.none
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUsePopupMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/usePopup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePopup(`type`: menu | listbox | dialog): ArrowProps = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any]).asInstanceOf[ArrowProps]
  inline def usePopup(
    `type`: menu | listbox | dialog,
    hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp: UsePopupOptions
  ): ArrowProps = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any], hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp.asInstanceOf[js.Any])).asInstanceOf[ArrowProps]
  
  trait UsePopupOptions extends StObject {
    
    var allowFlip: js.UndefOr[Boolean] = js.undefined
    
    var allowPreventOverflow: js.UndefOr[Boolean] = js.undefined
    
    var boundaryElement: js.UndefOr[HTMLElement] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hasArrow: js.UndefOr[Boolean] = js.undefined
    
    var hideOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var hideOnLeave: js.UndefOr[Boolean] = js.undefined
    
    var hideOnOutsideClick: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyProp: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var onOpenChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Element, Event], /* newValue */ Boolean, Unit]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean | Null] = js.undefined
    
    var position: js.UndefOr[OverlayPosition] = js.undefined
    
    var restoreFocus: js.UndefOr[Boolean] = js.undefined
    
    var trigger: js.UndefOr[none | click] = js.undefined
  }
  object UsePopupOptions {
    
    inline def apply(): UsePopupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsePopupOptions]
    }
    
    extension [Self <: UsePopupOptions](x: Self) {
      
      inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
      
      inline def setAllowFlipUndefined: Self = StObject.set(x, "allowFlip", js.undefined)
      
      inline def setAllowPreventOverflow(value: Boolean): Self = StObject.set(x, "allowPreventOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventOverflowUndefined: Self = StObject.set(x, "allowPreventOverflow", js.undefined)
      
      inline def setBoundaryElement(value: HTMLElement): Self = StObject.set(x, "boundaryElement", value.asInstanceOf[js.Any])
      
      inline def setBoundaryElementUndefined: Self = StObject.set(x, "boundaryElement", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasArrow(value: Boolean): Self = StObject.set(x, "hasArrow", value.asInstanceOf[js.Any])
      
      inline def setHasArrowUndefined: Self = StObject.set(x, "hasArrow", js.undefined)
      
      inline def setHideOnEscape(value: Boolean): Self = StObject.set(x, "hideOnEscape", value.asInstanceOf[js.Any])
      
      inline def setHideOnEscapeUndefined: Self = StObject.set(x, "hideOnEscape", js.undefined)
      
      inline def setHideOnLeave(value: Boolean): Self = StObject.set(x, "hideOnLeave", value.asInstanceOf[js.Any])
      
      inline def setHideOnLeaveUndefined: Self = StObject.set(x, "hideOnLeave", js.undefined)
      
      inline def setHideOnOutsideClick(value: Boolean): Self = StObject.set(x, "hideOnOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnOutsideClickUndefined: Self = StObject.set(x, "hideOnOutsideClick", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyProp(value: String): Self = StObject.set(x, "keyProp", value.asInstanceOf[js.Any])
      
      inline def setKeyPropUndefined: Self = StObject.set(x, "keyProp", js.undefined)
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOnOpenChange(value: (/* event */ SyntheticEvent[Element, Event], /* newValue */ Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenNull: Self = StObject.set(x, "open", null)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(value: OverlayPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRestoreFocus(value: Boolean): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
      
      inline def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      inline def setTrigger(value: none | click): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
