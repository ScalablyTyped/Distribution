package typings.openfin.webcontentsMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebContentsEventMapping[Topic, Type] extends BaseEventMap {
  var blurred: WindowEvent[Topic, Type] = js.native
  var `certificate-error`: CertificateErrorEvent[Topic, Type] = js.native
  var crashed: CrashedEvent with (WindowEvent[Topic, Type]) = js.native
  var `did-change-theme-color`: WindowEvent[Topic, Type] = js.native
  var focused: WindowEvent[Topic, Type] = js.native
  var `found-in-page`: WindowEvent[Topic, Type] = js.native
  var `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type] = js.native
  var `page-favicon-updated`: WindowEvent[Topic, Type] = js.native
  var `page-title-updated`: PageTitleUpdatedEvent[Topic, Type] = js.native
  var `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type] = js.native
  var `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type] = js.native
}

object WebContentsEventMapping {
  @scala.inline
  def apply[Topic, Type](
    blurred: WindowEvent[Topic, Type],
    `certificate-error`: CertificateErrorEvent[Topic, Type],
    crashed: CrashedEvent with (WindowEvent[Topic, Type]),
    `did-change-theme-color`: WindowEvent[Topic, Type],
    focused: WindowEvent[Topic, Type],
    `found-in-page`: WindowEvent[Topic, Type],
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    newListener: String,
    `page-favicon-updated`: WindowEvent[Topic, Type],
    `page-title-updated`: PageTitleUpdatedEvent[Topic, Type],
    `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
  ): WebContentsEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebContentsEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class WebContentsEventMappingOps[Self <: WebContentsEventMapping[_, _], Topic, Type] (val x: Self with (WebContentsEventMapping[Topic, Type])) extends AnyVal {
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
    def setBlurred(value: WindowEvent[Topic, Type]): Self = this.set("blurred", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCertificate-error`(value: CertificateErrorEvent[Topic, Type]): Self = this.set("certificate-error", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrashed(value: CrashedEvent with (WindowEvent[Topic, Type])): Self = this.set("crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDid-change-theme-color`(value: WindowEvent[Topic, Type]): Self = this.set("did-change-theme-color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: WindowEvent[Topic, Type]): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFound-in-page`(value: WindowEvent[Topic, Type]): Self = this.set("found-in-page", value.asInstanceOf[js.Any])
    @scala.inline
    def `setNavigation-rejected`(value: WindowNavigationRejectedEvent[Topic, Type]): Self = this.set("navigation-rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage-favicon-updated`(value: WindowEvent[Topic, Type]): Self = this.set("page-favicon-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage-title-updated`(value: PageTitleUpdatedEvent[Topic, Type]): Self = this.set("page-title-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setResource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, Type]): Self = this.set("resource-load-failed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setResource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, Type]): Self = this.set("resource-response-received", value.asInstanceOf[js.Any])
  }
  
}

