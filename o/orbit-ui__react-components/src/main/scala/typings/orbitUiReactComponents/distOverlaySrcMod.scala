package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.ArrowProps
import typings.orbitUiReactComponents.anon.ArrowRef
import typings.orbitUiReactComponents.anon.ClassNameString
import typings.orbitUiReactComponents.anon.OnClick
import typings.orbitUiReactComponents.anon.OnFocus
import typings.orbitUiReactComponents.anon.OnKeyDown
import typings.orbitUiReactComponents.anon.OnKeyDownUndefined
import typings.orbitUiReactComponents.anon.`1`
import typings.orbitUiReactComponents.distOverlaySrcOverlayArrowMod.InnerOverlayArrowProps
import typings.orbitUiReactComponents.distOverlaySrcOverlayMod.InnerOverlayProps
import typings.orbitUiReactComponents.distOverlaySrcUnderlayMod.InnerUnderlayProps
import typings.orbitUiReactComponents.distOverlaySrcUseOverlayFocusRingMod.UseOverlayFocusRingProps
import typings.orbitUiReactComponents.distOverlaySrcUseOverlayLightDismissMod.UseOverlayLightDismissOptions
import typings.orbitUiReactComponents.distOverlaySrcUseOverlayPositionMod.UseOverlayPositionOptions
import typings.orbitUiReactComponents.distOverlaySrcUseOverlayTriggerMod.UseOverlayTriggerOptions
import typings.orbitUiReactComponents.distOverlaySrcUsePopupMod.UsePopupOptions
import typings.orbitUiReactComponents.distOverlaySrcUseRestoreFocusMod.UseRestoreFocusOptions
import typings.orbitUiReactComponents.distOverlaySrcUseTriggerWidthMod.UseTriggerWidthOptions
import typings.orbitUiReactComponents.distSharedMod.DomScope
import typings.orbitUiReactComponents.distSharedMod.FocusManager
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.listbox
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.menu
import typings.react.mod.RefCallback
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerOverlay(param0: InnerOverlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlay")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOverlayArrow(param0: InnerOverlayArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlayArrow")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerUnderlay(param0: InnerUnderlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerUnderlay")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
  inline def useOverlayFocusRing(param0: UseOverlayFocusRingProps): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")(param0.asInstanceOf[js.Any]).asInstanceOf[ClassNameString]
  
  inline def useOverlayLightDismiss(overlayRef: RefObject[HTMLElement]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def useOverlayLightDismiss(overlayRef: RefObject[HTMLElement], param1: UseOverlayLightDismissOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def useOverlayPosition(): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")().asInstanceOf[ArrowRef]
  inline def useOverlayPosition(param0: UseOverlayPositionOptions): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")(param0.asInstanceOf[js.Any]).asInstanceOf[ArrowRef]
  
  inline def useOverlayTrigger(isOpen: Boolean): OnClick | OnFocus | OnKeyDown = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any]).asInstanceOf[OnClick | OnFocus | OnKeyDown]
  inline def useOverlayTrigger(isOpen: Boolean, param1: UseOverlayTriggerOptions): OnClick | OnFocus | OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[OnClick | OnFocus | OnKeyDown]
  
  inline def usePopup(`type`: menu | listbox | dialog): ArrowProps = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any]).asInstanceOf[ArrowProps]
  inline def usePopup(`type`: menu | listbox | dialog, param1: UsePopupOptions): ArrowProps = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ArrowProps]
  
  inline def useRestoreFocus(scope: DomScope): OnKeyDownUndefined | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[OnKeyDownUndefined | `1`]
  inline def useRestoreFocus(scope: DomScope, param1: UseRestoreFocusOptions): OnKeyDownUndefined | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownUndefined | `1`]
  
  inline def useTrapFocus(focusManager: FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useTrapFocus")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useTriggerWidth(): js.Tuple2[RefCallback[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")().asInstanceOf[js.Tuple2[RefCallback[HTMLElement], String]]
  inline def useTriggerWidth(param0: UseTriggerWidthOptions): js.Tuple2[RefCallback[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefCallback[HTMLElement], String]]
}
