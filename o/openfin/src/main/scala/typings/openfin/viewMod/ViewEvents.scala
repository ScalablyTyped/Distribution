package typings.openfin.viewMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`target-changed`
import typings.openfin.openfinStrings.attached
import typings.openfin.openfinStrings.created
import typings.openfin.openfinStrings.destroyed
import typings.openfin.openfinStrings.hidden
import typings.openfin.openfinStrings.hotkey
import typings.openfin.openfinStrings.shown
import typings.openfin.openfinStrings.view
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.ViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.ViewEventMapping<'view', Type>[Type]} */
@js.native
trait ViewEvents extends js.Object {
  var attached: WindowEvent[view, typings.openfin.openfinStrings.attached] = js.native
  var blurred: WindowEvent[String, String] = js.native
  var `certificate-error`: CertificateErrorEvent[String, String] = js.native
  var crashed: CrashedEvent with (WindowEvent[String, String]) = js.native
  var created: WindowEvent[view, typings.openfin.openfinStrings.created] = js.native
  var destroyed: WindowEvent[view, typings.openfin.openfinStrings.destroyed] = js.native
  var `did-change-theme-color`: WindowEvent[String, String] = js.native
  var focused: WindowEvent[String, String] = js.native
  var `found-in-page`: WindowEvent[String, String] = js.native
  var hidden: WindowEvent[view, typings.openfin.openfinStrings.hidden] = js.native
  var hotkey: InputEvent with (WindowEvent[view, typings.openfin.openfinStrings.hotkey]) = js.native
  var listenerRemoved: String = js.native
  var `navigation-rejected`: WindowNavigationRejectedEvent[String, String] = js.native
  var newListener: String = js.native
  var `page-favicon-updated`: WindowEvent[String, String] = js.native
  var `page-title-updated`: PageTitleUpdatedEvent[String, String] = js.native
  var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String] = js.native
  var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String] = js.native
  var shown: WindowEvent[view, typings.openfin.openfinStrings.shown] = js.native
  var `target-changed`: TargetChangedEvent[view, typings.openfin.openfinStrings.`target-changed`] = js.native
}

object ViewEvents {
  @scala.inline
  def apply(
    attached: WindowEvent[view, attached],
    blurred: WindowEvent[String, String],
    `certificate-error`: CertificateErrorEvent[String, String],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    created: WindowEvent[view, created],
    destroyed: WindowEvent[view, destroyed],
    `did-change-theme-color`: WindowEvent[String, String],
    focused: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    hidden: WindowEvent[view, hidden],
    hotkey: InputEvent with (WindowEvent[view, hotkey]),
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    shown: WindowEvent[view, shown],
    `target-changed`: TargetChangedEvent[view, `target-changed`]
  ): ViewEvents = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], blurred = blurred.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hotkey = hotkey.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-changed")(`target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEvents]
  }
  @scala.inline
  implicit class ViewEventsOps[Self <: ViewEvents] (val x: Self) extends AnyVal {
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
    def setAttached(value: WindowEvent[view, attached]): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurred(value: WindowEvent[String, String]): Self = this.set("blurred", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCertificate-error`(value: CertificateErrorEvent[String, String]): Self = this.set("certificate-error", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrashed(value: CrashedEvent with (WindowEvent[String, String])): Self = this.set("crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: WindowEvent[view, created]): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroyed(value: WindowEvent[view, destroyed]): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDid-change-theme-color`(value: WindowEvent[String, String]): Self = this.set("did-change-theme-color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: WindowEvent[String, String]): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFound-in-page`(value: WindowEvent[String, String]): Self = this.set("found-in-page", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: WindowEvent[view, hidden]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotkey(value: InputEvent with (WindowEvent[view, hotkey])): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerRemoved(value: String): Self = this.set("listenerRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def `setNavigation-rejected`(value: WindowNavigationRejectedEvent[String, String]): Self = this.set("navigation-rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewListener(value: String): Self = this.set("newListener", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage-favicon-updated`(value: WindowEvent[String, String]): Self = this.set("page-favicon-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage-title-updated`(value: PageTitleUpdatedEvent[String, String]): Self = this.set("page-title-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setResource-load-failed`(value: WindowResourceLoadFailedEvent[String, String]): Self = this.set("resource-load-failed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setResource-response-received`(value: WindowResourceResponseReceivedEvent[String, String]): Self = this.set("resource-response-received", value.asInstanceOf[js.Any])
    @scala.inline
    def setShown(value: WindowEvent[view, shown]): Self = this.set("shown", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTarget-changed`(value: TargetChangedEvent[view, `target-changed`]): Self = this.set("target-changed", value.asInstanceOf[js.Any])
  }
  
}

