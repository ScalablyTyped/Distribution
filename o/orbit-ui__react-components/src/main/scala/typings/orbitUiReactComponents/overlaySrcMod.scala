package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.ArrowProps
import typings.orbitUiReactComponents.anon.ArrowRef
import typings.orbitUiReactComponents.anon.ClassNameString
import typings.orbitUiReactComponents.anon.OnClick
import typings.orbitUiReactComponents.anon.OnFocus
import typings.orbitUiReactComponents.anon.OnKeyDown
import typings.orbitUiReactComponents.anon.OnKeyDownUndefined
import typings.orbitUiReactComponents.anon.`1`
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.listbox
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.menu
import typings.orbitUiReactComponents.overlayArrowMod.InnerOverlayArrowProps
import typings.orbitUiReactComponents.sharedMod.DomScope
import typings.orbitUiReactComponents.sharedMod.FocusManager
import typings.orbitUiReactComponents.srcOverlayMod.InnerOverlayProps
import typings.orbitUiReactComponents.underlayMod.InnerUnderlayProps
import typings.orbitUiReactComponents.useOverlayFocusRingMod.UseOverlayFocusRingProps
import typings.orbitUiReactComponents.useOverlayLightDismissMod.UseOverlayLightDismissOptions
import typings.orbitUiReactComponents.useOverlayPositionMod.UseOverlayPositionOptions
import typings.orbitUiReactComponents.useOverlayTriggerMod.UseOverlayTriggerOptions
import typings.orbitUiReactComponents.usePopupMod.UsePopupOptions
import typings.orbitUiReactComponents.useRestoreFocusMod.UseRestoreFocusOptions
import typings.orbitUiReactComponents.useTriggerWidthMod.UseTriggerWidthOptions
import typings.react.mod.RefCallback
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlaySrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerOverlay(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest: InnerOverlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlay")(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOverlayArrow(hasAsForwardedRefRest: InnerOverlayArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlayArrow")(hasAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerUnderlay(hasZIndexAsForwardedRefRest: InnerUnderlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerUnderlay")(hasZIndexAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", "Overlay")
  @js.native
  val Overlay: OrbitComponent[HTMLElement, InnerOverlayProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", "OverlayArrow")
  @js.native
  val OverlayArrow: OrbitComponent[HTMLElement, InnerOverlayArrowProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", "Underlay")
  @js.native
  val Underlay: OrbitComponent[HTMLElement, InnerUnderlayProps] = js.native
  
  inline def isDevToolsBlurEvent(rootRef: RefObject[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevToolsBlurEvent")(rootRef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTargetParent(target: EventTarget, parentRef: RefObject[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetParent")(target.asInstanceOf[js.Any], parentRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useOverlayFocusRing(): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")().asInstanceOf[ClassNameString]
  inline def useOverlayFocusRing(hasFocus: UseOverlayFocusRingProps): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")(hasFocus.asInstanceOf[js.Any]).asInstanceOf[ClassNameString]
  
  inline def useOverlayLightDismiss(overlayRef: RefObject[HTMLElement]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def useOverlayLightDismiss(
    overlayRef: RefObject[HTMLElement],
    hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick: UseOverlayLightDismissOptions
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any], hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def useOverlayPosition(): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")().asInstanceOf[ArrowRef]
  inline def useOverlayPosition(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow: UseOverlayPositionOptions): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow.asInstanceOf[js.Any]).asInstanceOf[ArrowRef]
  
  inline def useOverlayTrigger(isOpen: Boolean): OnClick | OnFocus | OnKeyDown = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any]).asInstanceOf[OnClick | OnFocus | OnKeyDown]
  inline def useOverlayTrigger(isOpen: Boolean, hasHideOnLeaveTriggerOnShowOnHideIsDisabled: UseOverlayTriggerOptions): OnClick | OnFocus | OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any], hasHideOnLeaveTriggerOnShowOnHideIsDisabled.asInstanceOf[js.Any])).asInstanceOf[OnClick | OnFocus | OnKeyDown]
  
  inline def usePopup(`type`: menu | listbox | dialog): ArrowProps = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any]).asInstanceOf[ArrowProps]
  inline def usePopup(
    `type`: menu | listbox | dialog,
    hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp: UsePopupOptions
  ): ArrowProps = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any], hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp.asInstanceOf[js.Any])).asInstanceOf[ArrowProps]
  
  inline def useRestoreFocus(scope: DomScope): OnKeyDownUndefined | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[OnKeyDownUndefined | `1`]
  inline def useRestoreFocus(scope: DomScope, hasIsDisabled: UseRestoreFocusOptions): OnKeyDownUndefined | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any], hasIsDisabled.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownUndefined | `1`]
  
  inline def useTrapFocus(focusManager: FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useTrapFocus")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useTriggerWidth(): js.Tuple2[RefCallback[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")().asInstanceOf[js.Tuple2[RefCallback[HTMLElement], String]]
  inline def useTriggerWidth(hasIsDisabled: UseTriggerWidthOptions): js.Tuple2[RefCallback[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")(hasIsDisabled.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefCallback[HTMLElement], String]]
}
