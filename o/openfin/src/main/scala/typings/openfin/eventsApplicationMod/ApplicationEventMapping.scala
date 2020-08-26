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

@js.native
trait ApplicationEventMapping[Topic, Type] extends BaseEventMap {
  var closed: ApplicationEvent[Topic, Type] = js.native
  var connected: ApplicationEvent[Topic, Type] = js.native
  var crashed: CrashedEvent with (ApplicationEvent[Topic, Type]) = js.native
  var initialized: ApplicationEvent[Topic, Type] = js.native
  var `manifest-changed`: ApplicationEvent[Topic, Type] = js.native
  var `not-responding`: ApplicationEvent[Topic, Type] = js.native
  var responding: ApplicationEvent[Topic, Type] = js.native
  var `run-requested`: RunRequestedEvent[Topic, Type] = js.native
  var started: ApplicationEvent[Topic, Type] = js.native
  var `tray-icon-clicked`: TrayIconClicked[Topic, Type] = js.native
  var `window-alert-requested`: WindowAlertRequestedEvent[Topic, Type] = js.native
  var `window-auth-requested`: WindowAuthRequestedEvent[Topic, Type] = js.native
  var `window-created`: WindowEvent[Topic, Type] = js.native
  var `window-end-load`: WindowEndLoadEvent[Topic, Type] = js.native
  var `window-not-responding`: WindowEvent[Topic, Type] = js.native
  var `window-performance-report`: WindowPerformanceReport[Topic, Type] = js.native
  var `window-responding`: WindowEvent[Topic, Type] = js.native
  var `window-show-requested`: WindowEvent[Topic, Type] = js.native
  var `window-start-load`: WindowEvent[Topic, Type] = js.native
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
  @scala.inline
  implicit class ApplicationEventMappingOps[Self <: ApplicationEventMapping[_, _], Topic, Type] (val x: Self with (ApplicationEventMapping[Topic, Type])) extends AnyVal {
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
    def setClosed(value: ApplicationEvent[Topic, Type]): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnected(value: ApplicationEvent[Topic, Type]): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrashed(value: CrashedEvent with (ApplicationEvent[Topic, Type])): Self = this.set("crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialized(value: ApplicationEvent[Topic, Type]): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setManifest-changed`(value: ApplicationEvent[Topic, Type]): Self = this.set("manifest-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setNot-responding`(value: ApplicationEvent[Topic, Type]): Self = this.set("not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponding(value: ApplicationEvent[Topic, Type]): Self = this.set("responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setRun-requested`(value: RunRequestedEvent[Topic, Type]): Self = this.set("run-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarted(value: ApplicationEvent[Topic, Type]): Self = this.set("started", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTray-icon-clicked`(value: TrayIconClicked[Topic, Type]): Self = this.set("tray-icon-clicked", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[Topic, Type]): Self = this.set("window-alert-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[Topic, Type]): Self = this.set("window-auth-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-created`(value: WindowEvent[Topic, Type]): Self = this.set("window-created", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, Type]): Self = this.set("window-end-load", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-not-responding`(value: WindowEvent[Topic, Type]): Self = this.set("window-not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self = this.set("window-performance-report", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-responding`(value: WindowEvent[Topic, Type]): Self = this.set("window-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-show-requested`(value: WindowEvent[Topic, Type]): Self = this.set("window-show-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-start-load`(value: WindowEvent[Topic, Type]): Self = this.set("window-start-load", value.asInstanceOf[js.Any])
  }
  
}

