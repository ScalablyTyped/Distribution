package typings.openfin.eventsApplicationMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropagatedApplicationEventMapping[Topic, Type] extends js.Object {
  var `application-closed`: ApplicationEvent[Topic, Type] = js.native
  var `application-connected`: ApplicationEvent[Topic, Type] = js.native
  var `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, Type]) = js.native
  var `application-initialized`: ApplicationEvent[Topic, Type] = js.native
  var `application-manifest-changed`: ApplicationEvent[Topic, Type] = js.native
  var `application-not-responding`: ApplicationEvent[Topic, Type] = js.native
  var `application-responding`: ApplicationEvent[Topic, Type] = js.native
  var `application-started`: ApplicationEvent[Topic, Type] = js.native
  var `application-tray-icon-clicked`: TrayIconClicked[Topic, Type] = js.native
  var `window-created`: WindowEvent[Topic, Type] = js.native
  var `window-did-change-theme-color`: WindowEvent[Topic, Type] = js.native
  var `window-end-load`: WindowEndLoadEvent[Topic, Type] = js.native
  var `window-not-responding`: WindowEvent[Topic, Type] = js.native
  var `window-page-favicon-updated`: WindowEvent[Topic, Type] = js.native
  var `window-page-title-updated`: WindowEvent[Topic, Type] = js.native
  var `window-performance-report`: WindowPerformanceReport[Topic, Type] = js.native
  var `window-responding`: WindowEvent[Topic, Type] = js.native
  var `window-start-load`: WindowEvent[Topic, Type] = js.native
}

object PropagatedApplicationEventMapping {
  @scala.inline
  def apply[Topic, Type](
    `application-closed`: ApplicationEvent[Topic, Type],
    `application-connected`: ApplicationEvent[Topic, Type],
    `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, Type]),
    `application-initialized`: ApplicationEvent[Topic, Type],
    `application-manifest-changed`: ApplicationEvent[Topic, Type],
    `application-not-responding`: ApplicationEvent[Topic, Type],
    `application-responding`: ApplicationEvent[Topic, Type],
    `application-started`: ApplicationEvent[Topic, Type],
    `application-tray-icon-clicked`: TrayIconClicked[Topic, Type],
    `window-created`: WindowEvent[Topic, Type],
    `window-did-change-theme-color`: WindowEvent[Topic, Type],
    `window-end-load`: WindowEndLoadEvent[Topic, Type],
    `window-not-responding`: WindowEvent[Topic, Type],
    `window-page-favicon-updated`: WindowEvent[Topic, Type],
    `window-page-title-updated`: WindowEvent[Topic, Type],
    `window-performance-report`: WindowPerformanceReport[Topic, Type],
    `window-responding`: WindowEvent[Topic, Type],
    `window-start-load`: WindowEvent[Topic, Type]
  ): PropagatedApplicationEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application-closed")(`application-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-connected")(`application-connected`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-crashed")(`application-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-initialized")(`application-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-manifest-changed")(`application-manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-not-responding")(`application-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-responding")(`application-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-started")(`application-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-tray-icon-clicked")(`application-tray-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedApplicationEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class PropagatedApplicationEventMappingOps[Self <: PropagatedApplicationEventMapping[_, _], Topic, Type] (val x: Self with (PropagatedApplicationEventMapping[Topic, Type])) extends AnyVal {
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
    def `setApplication-closed`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-closed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-connected`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-connected", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-crashed`(value: CrashedEvent with (ApplicationEvent[Topic, Type])): Self = this.set("application-crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-initialized`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-manifest-changed`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-manifest-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-not-responding`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-responding`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-started`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-started", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-tray-icon-clicked`(value: TrayIconClicked[Topic, Type]): Self = this.set("application-tray-icon-clicked", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-created`(value: WindowEvent[Topic, Type]): Self = this.set("window-created", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-did-change-theme-color`(value: WindowEvent[Topic, Type]): Self = this.set("window-did-change-theme-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, Type]): Self = this.set("window-end-load", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-not-responding`(value: WindowEvent[Topic, Type]): Self = this.set("window-not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-page-favicon-updated`(value: WindowEvent[Topic, Type]): Self = this.set("window-page-favicon-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-page-title-updated`(value: WindowEvent[Topic, Type]): Self = this.set("window-page-title-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self = this.set("window-performance-report", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-responding`(value: WindowEvent[Topic, Type]): Self = this.set("window-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-start-load`(value: WindowEvent[Topic, Type]): Self = this.set("window-start-load", value.asInstanceOf[js.Any])
  }
  
}

