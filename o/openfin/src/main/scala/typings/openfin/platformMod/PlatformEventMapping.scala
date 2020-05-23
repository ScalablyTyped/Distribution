package typings.openfin.platformMod

import typings.openfin.eventsApplicationMod.ApplicationEventMapping
import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsApplicationMod.RunRequestedEvent
import typings.openfin.eventsApplicationMod.TrayIconClicked
import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowAlertRequestedEvent
import typings.openfin.windowMod.WindowAuthRequestedEvent
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformEventMapping[Topic, Type] extends ApplicationEventMapping[String, String] {
  var `platform-api-ready`: ApplicationEvent[Topic, Type]
  var `platform-snapshot-applied`: ApplicationEvent[Topic, Type]
}

object PlatformEventMapping {
  @scala.inline
  def apply[Topic, Type](
    closed: ApplicationEvent[String, String],
    connected: ApplicationEvent[String, String],
    crashed: CrashedEvent with (ApplicationEvent[String, String]),
    initialized: ApplicationEvent[String, String],
    listenerRemoved: String,
    `manifest-changed`: ApplicationEvent[String, String],
    newListener: String,
    `not-responding`: ApplicationEvent[String, String],
    `platform-api-ready`: ApplicationEvent[Topic, Type],
    `platform-snapshot-applied`: ApplicationEvent[Topic, Type],
    responding: ApplicationEvent[String, String],
    `run-requested`: RunRequestedEvent[String, String],
    started: ApplicationEvent[String, String],
    `tray-icon-clicked`: TrayIconClicked[String, String],
    `window-alert-requested`: WindowAlertRequestedEvent[String, String],
    `window-auth-requested`: WindowAuthRequestedEvent[String, String],
    `window-created`: WindowEvent[String, String],
    `window-end-load`: WindowEndLoadEvent[String, String],
    `window-not-responding`: WindowEvent[String, String],
    `window-performance-report`: WindowPerformanceReport[String, String],
    `window-responding`: WindowEvent[String, String],
    `window-show-requested`: WindowEvent[String, String],
    `window-start-load`: WindowEvent[String, String]
  ): PlatformEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("platform-api-ready")(`platform-api-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("platform-snapshot-applied")(`platform-snapshot-applied`.asInstanceOf[js.Any])
    __obj.updateDynamic("run-requested")(`run-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("tray-icon-clicked")(`tray-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-alert-requested")(`window-alert-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-auth-requested")(`window-auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-show-requested")(`window-show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformEventMapping[Topic, Type]]
  }
}

