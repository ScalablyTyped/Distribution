package typings.openfin.eventsApplicationMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropagatedApplicationEventMapping[Topic, Type] extends js.Object {
  var `application-closed`: ApplicationEvent[Topic, Type]
  var `application-connected`: ApplicationEvent[Topic, Type]
  var `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, Type])
  var `application-initialized`: ApplicationEvent[Topic, Type]
  var `application-manifest-changed`: ApplicationEvent[Topic, Type]
  var `application-not-responding`: ApplicationEvent[Topic, Type]
  var `application-responding`: ApplicationEvent[Topic, Type]
  var `application-started`: ApplicationEvent[Topic, Type]
  var `application-tray-icon-clicked`: TrayIconClicked[Topic, Type]
  var `window-created`: WindowEvent[Topic, Type]
  var `window-did-change-theme-color`: WindowEvent[Topic, Type]
  var `window-end-load`: WindowEndLoadEvent[Topic, Type]
  var `window-not-responding`: WindowEvent[Topic, Type]
  var `window-page-favicon-updated`: WindowEvent[Topic, Type]
  var `window-page-title-updated`: WindowEvent[Topic, Type]
  var `window-performance-report`: WindowPerformanceReport[Topic, Type]
  var `window-responding`: WindowEvent[Topic, Type]
  var `window-start-load`: WindowEvent[Topic, Type]
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
}

