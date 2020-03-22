package typings.openfin.viewMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WebContentsEventMapping
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewEventMapping[Topic, Type] extends WebContentsEventMapping[String, String] {
  var attached: WindowEvent[Topic, Type]
  var created: WindowEvent[Topic, Type]
  var destroyed: WindowEvent[Topic, Type]
  var hidden: WindowEvent[Topic, Type]
  var shown: WindowEvent[Topic, Type]
  var `target-changed`: WindowEvent[Topic, Type]
}

object ViewEventMapping {
  @scala.inline
  def apply[Topic, Type](
    attached: WindowEvent[Topic, Type],
    `certificate-error`: CertificateErrorEvent[String, String],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    created: WindowEvent[Topic, Type],
    destroyed: WindowEvent[Topic, Type],
    `did-change-theme-color`: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    hidden: WindowEvent[Topic, Type],
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    shown: WindowEvent[Topic, Type],
    `target-changed`: WindowEvent[Topic, Type]
  ): ViewEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-changed")(`target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEventMapping[Topic, Type]]
  }
}

