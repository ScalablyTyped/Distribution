package typings.openfin.webcontentsMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebContentsEventMapping[Topic, Type] extends BaseEventMap {
  var `certificate-error`: CertificateErrorEvent[Topic, Type]
  var crashed: CrashedEvent with (WindowEvent[Topic, Type])
  var `did-change-theme-color`: WindowEvent[Topic, Type]
  var `found-in-page`: WindowEvent[Topic, Type]
  var `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type]
  var `page-favicon-updated`: WindowEvent[Topic, Type]
  var `page-title-updated`: PageTitleUpdatedEvent[Topic, Type]
  var `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type]
  var `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
}

object WebContentsEventMapping {
  @scala.inline
  def apply[Topic, Type](
    `certificate-error`: CertificateErrorEvent[Topic, Type],
    crashed: CrashedEvent with (WindowEvent[Topic, Type]),
    `did-change-theme-color`: WindowEvent[Topic, Type],
    `found-in-page`: WindowEvent[Topic, Type],
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    newListener: String,
    `page-favicon-updated`: WindowEvent[Topic, Type],
    `page-title-updated`: PageTitleUpdatedEvent[Topic, Type],
    `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
  ): WebContentsEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(crashed = crashed.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
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
}

