package typings.openfin.platformMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsApplicationMod.TrayIconClicked
import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`platform-api-ready`
import typings.openfin.openfinStrings.`platform-snapshot-applied`
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/platform.PropagatedPlatformEventMapping<string, string> ]: openfin.openfin/_v2/api/events/platform.PropagatedPlatformEventMapping<Topic, Type>[Type]} */
trait PropagatedPlatformEvents[Topic] extends js.Object {
  var `application-closed`: ApplicationEvent[String, String]
  var `application-connected`: ApplicationEvent[String, String]
  var `application-crashed`: CrashedEvent with (ApplicationEvent[String, String])
  var `application-initialized`: ApplicationEvent[String, String]
  var `application-manifest-changed`: ApplicationEvent[String, String]
  var `application-not-responding`: ApplicationEvent[String, String]
  var `application-responding`: ApplicationEvent[String, String]
  var `application-started`: ApplicationEvent[String, String]
  var `application-tray-icon-clicked`: TrayIconClicked[String, String]
  var `platform-api-ready`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`platform-api-ready`]
  var `platform-snapshot-applied`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`platform-snapshot-applied`]
  var `window-created`: WindowEvent[String, String]
  var `window-did-change-theme-color`: WindowEvent[String, String]
  var `window-end-load`: WindowEndLoadEvent[String, String]
  var `window-not-responding`: WindowEvent[String, String]
  var `window-page-favicon-updated`: WindowEvent[String, String]
  var `window-page-title-updated`: WindowEvent[String, String]
  var `window-performance-report`: WindowPerformanceReport[String, String]
  var `window-responding`: WindowEvent[String, String]
  var `window-start-load`: WindowEvent[String, String]
}

object PropagatedPlatformEvents {
  @scala.inline
  def apply[Topic](
    `application-closed`: ApplicationEvent[String, String],
    `application-connected`: ApplicationEvent[String, String],
    `application-crashed`: CrashedEvent with (ApplicationEvent[String, String]),
    `application-initialized`: ApplicationEvent[String, String],
    `application-manifest-changed`: ApplicationEvent[String, String],
    `application-not-responding`: ApplicationEvent[String, String],
    `application-responding`: ApplicationEvent[String, String],
    `application-started`: ApplicationEvent[String, String],
    `application-tray-icon-clicked`: TrayIconClicked[String, String],
    `platform-api-ready`: ApplicationEvent[Topic, `platform-api-ready`],
    `platform-snapshot-applied`: ApplicationEvent[Topic, `platform-snapshot-applied`],
    `window-created`: WindowEvent[String, String],
    `window-did-change-theme-color`: WindowEvent[String, String],
    `window-end-load`: WindowEndLoadEvent[String, String],
    `window-not-responding`: WindowEvent[String, String],
    `window-page-favicon-updated`: WindowEvent[String, String],
    `window-page-title-updated`: WindowEvent[String, String],
    `window-performance-report`: WindowPerformanceReport[String, String],
    `window-responding`: WindowEvent[String, String],
    `window-start-load`: WindowEvent[String, String]
  ): PropagatedPlatformEvents[Topic] = {
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
    __obj.updateDynamic("platform-api-ready")(`platform-api-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("platform-snapshot-applied")(`platform-snapshot-applied`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedPlatformEvents[Topic]]
  }
}

