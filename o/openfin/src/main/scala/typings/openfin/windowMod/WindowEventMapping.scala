package typings.openfin.windowMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WebContentsEventMapping
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMapping[Topic, Type] extends WebContentsEventMapping[String, String] {
  var `auth-requested`: WindowAuthRequestedEvent[Topic, Type]
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type]
  var blurred: WindowEvent[Topic, Type]
  var `bounds-changed`: WindowBoundsChange[Topic, Type]
  var `bounds-changing`: WindowBoundsChange[Topic, Type]
  var `close-requested`: WindowEvent[Topic, Type]
  var closed: WindowEvent[Topic, Type]
  var closing: WindowEvent[Topic, Type]
  var `disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type]
  var `disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type]
  var embedded: WindowEvent[Topic, Type]
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[Topic, Type]
  var `external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type]
  var `external-process-started`: WindowExternalProcessStartedEvent[Topic, Type]
  var focused: WindowEvent[Topic, Type]
  var `group-changed`: WindowGroupChanged[Topic, Type]
  var hidden: WindowHiddenEvent[Topic, Type]
  var initialized: WindowEvent[Topic, Type]
  var maximized: WindowEvent[Topic, Type]
  var minimized: WindowEvent[Topic, Type]
  var `options-changed`: WindowOptionsChangedEvent[Topic, Type]
  var `performance-report`: WindowPerformanceReport[Topic, Type]
  var `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type]
  var `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[Topic, Type]
  var reloaded: WindowReloadedEvent[Topic, Type]
  var restored: WindowEvent[Topic, Type]
  var `show-requested`: WindowEvent[Topic, Type]
  var shown: WindowEvent[Topic, Type]
  var `user-movement-disabled`: WindowEvent[Topic, Type]
  var `user-movement-enabled`: WindowEvent[Topic, Type]
  var `view-attached`: WindowEvent[Topic, Type]
  var `view-detached`: WindowEvent[Topic, Type]
  var `will-move`: WillMoveOrResize[Topic, Type]
  var `will-resize`: WillMoveOrResize[Topic, Type]
}

object WindowEventMapping {
  @scala.inline
  def apply[Topic, Type](
    `auth-requested`: WindowAuthRequestedEvent[Topic, Type],
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    blurred: WindowEvent[Topic, Type],
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
    focused: WindowEvent[Topic, Type],
    `found-in-page`: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[Topic, Type],
    hidden: WindowHiddenEvent[Topic, Type],
    initialized: WindowEvent[Topic, Type],
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
    `view-detached`: WindowEvent[Topic, Type],
    `will-move`: WillMoveOrResize[Topic, Type],
    `will-resize`: WillMoveOrResize[Topic, Type]
  ): WindowEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], reloaded = reloaded.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
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
}

