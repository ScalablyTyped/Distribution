package typings.openfin.eventsApplicationMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowAlertRequestedEvent
import typings.openfin.windowMod.WindowAuthRequestedEvent
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationEventMapping[Topic, Type] extends BaseEventMap {
  var closed: ApplicationEvent[Topic, Type]
  var connected: ApplicationEvent[Topic, Type]
  var crashed: CrashedEvent with (ApplicationEvent[Topic, Type])
  var initialized: ApplicationEvent[Topic, Type]
  var `manifest-changed`: ApplicationEvent[Topic, Type]
  var `not-responding`: ApplicationEvent[Topic, Type]
  var responding: ApplicationEvent[Topic, Type]
  var `run-requested`: RunRequestedEvent[Topic, Type]
  var started: ApplicationEvent[Topic, Type]
  var `tray-icon-clicked`: TrayIconClicked[Topic, Type]
  var `window-alert-requested`: WindowAlertRequestedEvent[Topic, Type]
  var `window-auth-requested`: WindowAuthRequestedEvent[Topic, Type]
  var `window-created`: WindowEvent[Topic, Type]
  var `window-end-load`: WindowEndLoadEvent[Topic, Type]
  var `window-not-responding`: WindowEvent[Topic, Type]
  var `window-performance-report`: WindowPerformanceReport[Topic, Type]
  var `window-responding`: WindowEvent[Topic, Type]
  var `window-show-requested`: WindowEvent[Topic, Type]
  var `window-start-load`: WindowEvent[Topic, Type]
}

object ApplicationEventMapping {
  @scala.inline
  def apply[Topic, Type](
    closed: ApplicationEvent[Topic, Type],
    connected: ApplicationEvent[Topic, Type],
    crashed: CrashedEvent with (ApplicationEvent[Topic, Type]),
    initialized: ApplicationEvent[Topic, Type],
    listenerRemoved: String,
    `manifest-changed`: ApplicationEvent[Topic, Type],
    newListener: String,
    `not-responding`: ApplicationEvent[Topic, Type],
    responding: ApplicationEvent[Topic, Type],
    `run-requested`: RunRequestedEvent[Topic, Type],
    started: ApplicationEvent[Topic, Type],
    `tray-icon-clicked`: TrayIconClicked[Topic, Type],
    `window-alert-requested`: WindowAlertRequestedEvent[Topic, Type],
    `window-auth-requested`: WindowAuthRequestedEvent[Topic, Type],
    `window-created`: WindowEvent[Topic, Type],
    `window-end-load`: WindowEndLoadEvent[Topic, Type],
    `window-not-responding`: WindowEvent[Topic, Type],
    `window-performance-report`: WindowPerformanceReport[Topic, Type],
    `window-responding`: WindowEvent[Topic, Type],
    `window-show-requested`: WindowEvent[Topic, Type],
    `window-start-load`: WindowEvent[Topic, Type]
  ): ApplicationEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ApplicationEventMapping[Topic, Type]]
  }
}

