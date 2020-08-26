package typings.openfin.eventsApplicationMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`application-closed`
import typings.openfin.openfinStrings.`application-connected`
import typings.openfin.openfinStrings.`application-crashed`
import typings.openfin.openfinStrings.`application-initialized`
import typings.openfin.openfinStrings.`application-manifest-changed`
import typings.openfin.openfinStrings.`application-not-responding`
import typings.openfin.openfinStrings.`application-responding`
import typings.openfin.openfinStrings.`application-started`
import typings.openfin.openfinStrings.`application-tray-icon-clicked`
import typings.openfin.openfinStrings.`window-created`
import typings.openfin.openfinStrings.`window-did-change-theme-color`
import typings.openfin.openfinStrings.`window-end-load`
import typings.openfin.openfinStrings.`window-not-responding`
import typings.openfin.openfinStrings.`window-page-favicon-updated`
import typings.openfin.openfinStrings.`window-page-title-updated`
import typings.openfin.openfinStrings.`window-performance-report`
import typings.openfin.openfinStrings.`window-responding`
import typings.openfin.openfinStrings.`window-start-load`
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<Topic, Type>[Type]} */
@js.native
trait PropagatedApplicationEvents[Topic] extends js.Object {
  var `application-closed`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-closed`] = js.native
  var `application-connected`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-connected`] = js.native
  var `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-crashed`]) = js.native
  var `application-initialized`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-initialized`] = js.native
  var `application-manifest-changed`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-manifest-changed`] = js.native
  var `application-not-responding`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-not-responding`] = js.native
  var `application-responding`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-responding`] = js.native
  var `application-started`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-started`] = js.native
  var `application-tray-icon-clicked`: TrayIconClicked[Topic, typings.openfin.openfinStrings.`application-tray-icon-clicked`] = js.native
  var `window-created`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-created`] = js.native
  var `window-did-change-theme-color`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-did-change-theme-color`] = js.native
  var `window-end-load`: WindowEndLoadEvent[Topic, typings.openfin.openfinStrings.`window-end-load`] = js.native
  var `window-not-responding`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-not-responding`] = js.native
  var `window-page-favicon-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-page-favicon-updated`] = js.native
  var `window-page-title-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-page-title-updated`] = js.native
  var `window-performance-report`: WindowPerformanceReport[Topic, typings.openfin.openfinStrings.`window-performance-report`] = js.native
  var `window-responding`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-responding`] = js.native
  var `window-start-load`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-start-load`] = js.native
}

object PropagatedApplicationEvents {
  @scala.inline
  def apply[Topic](
    `application-closed`: ApplicationEvent[Topic, `application-closed`],
    `application-connected`: ApplicationEvent[Topic, `application-connected`],
    `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, `application-crashed`]),
    `application-initialized`: ApplicationEvent[Topic, `application-initialized`],
    `application-manifest-changed`: ApplicationEvent[Topic, `application-manifest-changed`],
    `application-not-responding`: ApplicationEvent[Topic, `application-not-responding`],
    `application-responding`: ApplicationEvent[Topic, `application-responding`],
    `application-started`: ApplicationEvent[Topic, `application-started`],
    `application-tray-icon-clicked`: TrayIconClicked[Topic, `application-tray-icon-clicked`],
    `window-created`: WindowEvent[Topic, `window-created`],
    `window-did-change-theme-color`: WindowEvent[Topic, `window-did-change-theme-color`],
    `window-end-load`: WindowEndLoadEvent[Topic, `window-end-load`],
    `window-not-responding`: WindowEvent[Topic, `window-not-responding`],
    `window-page-favicon-updated`: WindowEvent[Topic, `window-page-favicon-updated`],
    `window-page-title-updated`: WindowEvent[Topic, `window-page-title-updated`],
    `window-performance-report`: WindowPerformanceReport[Topic, `window-performance-report`],
    `window-responding`: WindowEvent[Topic, `window-responding`],
    `window-start-load`: WindowEvent[Topic, `window-start-load`]
  ): PropagatedApplicationEvents[Topic] = {
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
    __obj.asInstanceOf[PropagatedApplicationEvents[Topic]]
  }
  @scala.inline
  implicit class PropagatedApplicationEventsOps[Self <: PropagatedApplicationEvents[_], Topic] (val x: Self with PropagatedApplicationEvents[Topic]) extends AnyVal {
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
    def `setApplication-closed`(value: ApplicationEvent[Topic, `application-closed`]): Self = this.set("application-closed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-connected`(value: ApplicationEvent[Topic, `application-connected`]): Self = this.set("application-connected", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-crashed`(value: CrashedEvent with (ApplicationEvent[Topic, `application-crashed`])): Self = this.set("application-crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-initialized`(value: ApplicationEvent[Topic, `application-initialized`]): Self = this.set("application-initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-manifest-changed`(value: ApplicationEvent[Topic, `application-manifest-changed`]): Self = this.set("application-manifest-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-not-responding`(value: ApplicationEvent[Topic, `application-not-responding`]): Self = this.set("application-not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-responding`(value: ApplicationEvent[Topic, `application-responding`]): Self = this.set("application-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-started`(value: ApplicationEvent[Topic, `application-started`]): Self = this.set("application-started", value.asInstanceOf[js.Any])
    @scala.inline
    def `setApplication-tray-icon-clicked`(value: TrayIconClicked[Topic, `application-tray-icon-clicked`]): Self = this.set("application-tray-icon-clicked", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-created`(value: WindowEvent[Topic, `window-created`]): Self = this.set("window-created", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-did-change-theme-color`(value: WindowEvent[Topic, `window-did-change-theme-color`]): Self = this.set("window-did-change-theme-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, `window-end-load`]): Self = this.set("window-end-load", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-not-responding`(value: WindowEvent[Topic, `window-not-responding`]): Self = this.set("window-not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-page-favicon-updated`(value: WindowEvent[Topic, `window-page-favicon-updated`]): Self = this.set("window-page-favicon-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-page-title-updated`(value: WindowEvent[Topic, `window-page-title-updated`]): Self = this.set("window-page-title-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, `window-performance-report`]): Self = this.set("window-performance-report", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-responding`(value: WindowEvent[Topic, `window-responding`]): Self = this.set("window-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-start-load`(value: WindowEvent[Topic, `window-start-load`]): Self = this.set("window-start-load", value.asInstanceOf[js.Any])
  }
  
}

