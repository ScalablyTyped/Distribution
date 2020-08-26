package typings.openfin.windowMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.viewMod.InputEvent
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WebContentsEventMapping
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventMapping[Topic, Type] extends WebContentsEventMapping[String, String] {
  var `auth-requested`: WindowAuthRequestedEvent[Topic, Type] = js.native
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type] = js.native
  var `bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  var `bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  var `close-requested`: WindowEvent[Topic, Type] = js.native
  var closed: WindowEvent[Topic, Type] = js.native
  var closing: WindowEvent[Topic, Type] = js.native
  var `disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  var `disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  var embedded: WindowEvent[Topic, Type] = js.native
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[Topic, Type] = js.native
  var `external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type] = js.native
  var `external-process-started`: WindowExternalProcessStartedEvent[Topic, Type] = js.native
  var `group-changed`: WindowGroupChanged[Topic, Type] = js.native
  var hidden: WindowHiddenEvent[Topic, Type] = js.native
  var hotkey: InputEvent with (WindowEvent[Topic, Type]) = js.native
  var initialized: WindowEvent[Topic, Type] = js.native
  var `layout-initialized`: WindowEvent[Topic, Type] = js.native
  var `layout-ready`: WindowEvent[Topic, Type] = js.native
  var maximized: WindowEvent[Topic, Type] = js.native
  var minimized: WindowEvent[Topic, Type] = js.native
  var `options-changed`: WindowOptionsChangedEvent[Topic, Type] = js.native
  var `performance-report`: WindowPerformanceReport[Topic, Type] = js.native
  var `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type] = js.native
  var `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[Topic, Type] = js.native
  var reloaded: WindowReloadedEvent[Topic, Type] = js.native
  var restored: WindowEvent[Topic, Type] = js.native
  var `show-requested`: WindowEvent[Topic, Type] = js.native
  var shown: WindowEvent[Topic, Type] = js.native
  var `user-movement-disabled`: WindowEvent[Topic, Type] = js.native
  var `user-movement-enabled`: WindowEvent[Topic, Type] = js.native
  var `view-attached`: WindowEvent[Topic, Type] = js.native
  var `view-detached`: ViewDetached[Topic, Type] = js.native
  var `will-move`: WillMoveOrResize[Topic, Type] = js.native
  var `will-resize`: WillMoveOrResize[Topic, Type] = js.native
}

object WindowEventMapping {
  @scala.inline
  def apply[Topic, Type](
    `auth-requested`: WindowAuthRequestedEvent[Topic, Type],
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    blurred: WindowEvent[String, String],
    `bounds-changed`: WindowBoundsChange[Topic, Type],
    `bounds-changing`: WindowBoundsChange[Topic, Type],
    `certificate-error`: CertificateErrorEvent[String, String],
    `close-requested`: WindowEvent[Topic, Type],
    closed: WindowEvent[Topic, Type],
    closing: WindowEvent[Topic, Type],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    `did-change-theme-color`: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type],
    `disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type],
    embedded: WindowEvent[Topic, Type],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[Topic, Type],
    `external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type],
    `external-process-started`: WindowExternalProcessStartedEvent[Topic, Type],
    focused: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[Topic, Type],
    hidden: WindowHiddenEvent[Topic, Type],
    hotkey: InputEvent with (WindowEvent[Topic, Type]),
    initialized: WindowEvent[Topic, Type],
    `layout-initialized`: WindowEvent[Topic, Type],
    `layout-ready`: WindowEvent[Topic, Type],
    listenerRemoved: String,
    maximized: WindowEvent[Topic, Type],
    minimized: WindowEvent[Topic, Type],
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `options-changed`: WindowOptionsChangedEvent[Topic, Type],
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `performance-report`: WindowPerformanceReport[Topic, Type],
    `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    reloaded: WindowReloadedEvent[Topic, Type],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    restored: WindowEvent[Topic, Type],
    `show-requested`: WindowEvent[Topic, Type],
    shown: WindowEvent[Topic, Type],
    `user-movement-disabled`: WindowEvent[Topic, Type],
    `user-movement-enabled`: WindowEvent[Topic, Type],
    `view-attached`: WindowEvent[Topic, Type],
    `view-detached`: ViewDetached[Topic, Type],
    `will-move`: WillMoveOrResize[Topic, Type],
    `will-resize`: WillMoveOrResize[Topic, Type]
  ): WindowEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hotkey = hotkey.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], reloaded = reloaded.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("auth-requested")(`auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("close-requested")(`close-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-exited")(`external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-started")(`external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("layout-initialized")(`layout-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("layout-ready")(`layout-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("options-changed")(`options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("performance-report")(`performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changed")(`preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changing")(`preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-requested")(`show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-attached")(`view-attached`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-detached")(`view-detached`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-move")(`will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-resize")(`will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class WindowEventMappingOps[Self <: WindowEventMapping[_, _], Topic, Type] (val x: Self with (WindowEventMapping[Topic, Type])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAuth-requested`(value: WindowAuthRequestedEvent[Topic, Type]): Self = this.set("auth-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, Type]): Self = this.set("begin-user-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBounds-changed`(value: WindowBoundsChange[Topic, Type]): Self = this.set("bounds-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBounds-changing`(value: WindowBoundsChange[Topic, Type]): Self = this.set("bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setClose-requested`(value: WindowEvent[Topic, Type]): Self = this.set("close-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed(value: WindowEvent[Topic, Type]): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosing(value: WindowEvent[Topic, Type]): Self = this.set("closing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDisabled-movement-bounds-changed`(value: WindowBoundsChange[Topic, Type]): Self = this.set("disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDisabled-movement-bounds-changing`(value: WindowBoundsChange[Topic, Type]): Self = this.set("disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbedded(value: WindowEvent[Topic, Type]): Self = this.set("embedded", value.asInstanceOf[js.Any])
    @scala.inline
    def `setEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[Topic, Type]): Self = this.set("end-user-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setExternal-process-exited`(value: WindowExternalProcessExitedEvent[Topic, Type]): Self = this.set("external-process-exited", value.asInstanceOf[js.Any])
    @scala.inline
    def `setExternal-process-started`(value: WindowExternalProcessStartedEvent[Topic, Type]): Self = this.set("external-process-started", value.asInstanceOf[js.Any])
    @scala.inline
    def `setGroup-changed`(value: WindowGroupChanged[Topic, Type]): Self = this.set("group-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: WindowHiddenEvent[Topic, Type]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotkey(value: InputEvent with (WindowEvent[Topic, Type])): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialized(value: WindowEvent[Topic, Type]): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLayout-initialized`(value: WindowEvent[Topic, Type]): Self = this.set("layout-initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLayout-ready`(value: WindowEvent[Topic, Type]): Self = this.set("layout-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximized(value: WindowEvent[Topic, Type]): Self = this.set("maximized", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimized(value: WindowEvent[Topic, Type]): Self = this.set("minimized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOptions-changed`(value: WindowOptionsChangedEvent[Topic, Type]): Self = this.set("options-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPerformance-report`(value: WindowPerformanceReport[Topic, Type]): Self = this.set("performance-report", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPreload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self = this.set("preload-scripts-state-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPreload-scripts-state-changing`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self = this.set("preload-scripts-state-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def setReloaded(value: WindowReloadedEvent[Topic, Type]): Self = this.set("reloaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestored(value: WindowEvent[Topic, Type]): Self = this.set("restored", value.asInstanceOf[js.Any])
    @scala.inline
    def `setShow-requested`(value: WindowEvent[Topic, Type]): Self = this.set("show-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def setShown(value: WindowEvent[Topic, Type]): Self = this.set("shown", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-movement-disabled`(value: WindowEvent[Topic, Type]): Self = this.set("user-movement-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-movement-enabled`(value: WindowEvent[Topic, Type]): Self = this.set("user-movement-enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-attached`(value: WindowEvent[Topic, Type]): Self = this.set("view-attached", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-detached`(value: ViewDetached[Topic, Type]): Self = this.set("view-detached", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWill-move`(value: WillMoveOrResize[Topic, Type]): Self = this.set("will-move", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWill-resize`(value: WillMoveOrResize[Topic, Type]): Self = this.set("will-resize", value.asInstanceOf[js.Any])
  }
  
}

