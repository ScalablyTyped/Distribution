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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/platform.PropagatedPlatformEventMapping<string, string> ]: openfin.openfin/_v2/api/events/platform.PropagatedPlatformEventMapping<Topic, Type>[Type]} */
@js.native
trait PropagatedPlatformEvents[Topic] extends js.Object {
  
  var `application-closed`: ApplicationEvent[String, String] = js.native
  
  var `application-connected`: ApplicationEvent[String, String] = js.native
  
  var `application-crashed`: CrashedEvent with (ApplicationEvent[String, String]) = js.native
  
  var `application-initialized`: ApplicationEvent[String, String] = js.native
  
  var `application-manifest-changed`: ApplicationEvent[String, String] = js.native
  
  var `application-not-responding`: ApplicationEvent[String, String] = js.native
  
  var `application-responding`: ApplicationEvent[String, String] = js.native
  
  var `application-started`: ApplicationEvent[String, String] = js.native
  
  var `application-tray-icon-clicked`: TrayIconClicked[String, String] = js.native
  
  var `platform-api-ready`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`platform-api-ready`] = js.native
  
  var `platform-snapshot-applied`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`platform-snapshot-applied`] = js.native
  
  var `window-created`: WindowEvent[String, String] = js.native
  
  var `window-did-change-theme-color`: WindowEvent[String, String] = js.native
  
  var `window-end-load`: WindowEndLoadEvent[String, String] = js.native
  
  var `window-not-responding`: WindowEvent[String, String] = js.native
  
  var `window-page-favicon-updated`: WindowEvent[String, String] = js.native
  
  var `window-page-title-updated`: WindowEvent[String, String] = js.native
  
  var `window-performance-report`: WindowPerformanceReport[String, String] = js.native
  
  var `window-responding`: WindowEvent[String, String] = js.native
  
  var `window-start-load`: WindowEvent[String, String] = js.native
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
  
  @scala.inline
  implicit class PropagatedPlatformEventsOps[Self <: PropagatedPlatformEvents[_], Topic] (val x: Self with PropagatedPlatformEvents[Topic]) extends AnyVal {
    
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
    def `setApplication-closed`(value: ApplicationEvent[String, String]): Self = this.set("application-closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-connected`(value: ApplicationEvent[String, String]): Self = this.set("application-connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-crashed`(value: CrashedEvent with (ApplicationEvent[String, String])): Self = this.set("application-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-initialized`(value: ApplicationEvent[String, String]): Self = this.set("application-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-manifest-changed`(value: ApplicationEvent[String, String]): Self = this.set("application-manifest-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-not-responding`(value: ApplicationEvent[String, String]): Self = this.set("application-not-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-responding`(value: ApplicationEvent[String, String]): Self = this.set("application-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-started`(value: ApplicationEvent[String, String]): Self = this.set("application-started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-tray-icon-clicked`(value: TrayIconClicked[String, String]): Self = this.set("application-tray-icon-clicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlatform-api-ready`(value: ApplicationEvent[Topic, `platform-api-ready`]): Self = this.set("platform-api-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlatform-snapshot-applied`(value: ApplicationEvent[Topic, `platform-snapshot-applied`]): Self = this.set("platform-snapshot-applied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-created`(value: WindowEvent[String, String]): Self = this.set("window-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-did-change-theme-color`(value: WindowEvent[String, String]): Self = this.set("window-did-change-theme-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-end-load`(value: WindowEndLoadEvent[String, String]): Self = this.set("window-end-load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-not-responding`(value: WindowEvent[String, String]): Self = this.set("window-not-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-page-favicon-updated`(value: WindowEvent[String, String]): Self = this.set("window-page-favicon-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-page-title-updated`(value: WindowEvent[String, String]): Self = this.set("window-page-title-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-performance-report`(value: WindowPerformanceReport[String, String]): Self = this.set("window-performance-report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-responding`(value: WindowEvent[String, String]): Self = this.set("window-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-start-load`(value: WindowEvent[String, String]): Self = this.set("window-start-load", value.asInstanceOf[js.Any])
  }
}
