package typings.openfin.platformMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsApplicationMod.PropagatedApplicationEventMapping
import typings.openfin.eventsApplicationMod.TrayIconClicked
import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropagatedPlatformEventMapping[Topic, Type] extends PropagatedApplicationEventMapping[String, String] {
  
  var `platform-api-ready`: ApplicationEvent[Topic, Type] = js.native
  
  var `platform-snapshot-applied`: ApplicationEvent[Topic, Type] = js.native
}
object PropagatedPlatformEventMapping {
  
  @scala.inline
  def apply[Topic, Type](
    `application-closed`: ApplicationEvent[String, String],
    `application-connected`: ApplicationEvent[String, String],
    `application-crashed`: CrashedEvent with (ApplicationEvent[String, String]),
    `application-initialized`: ApplicationEvent[String, String],
    `application-manifest-changed`: ApplicationEvent[String, String],
    `application-not-responding`: ApplicationEvent[String, String],
    `application-responding`: ApplicationEvent[String, String],
    `application-started`: ApplicationEvent[String, String],
    `application-tray-icon-clicked`: TrayIconClicked[String, String],
    `platform-api-ready`: ApplicationEvent[Topic, Type],
    `platform-snapshot-applied`: ApplicationEvent[Topic, Type],
    `window-created`: WindowEvent[String, String],
    `window-did-change-theme-color`: WindowEvent[String, String],
    `window-end-load`: WindowEndLoadEvent[String, String],
    `window-not-responding`: WindowEvent[String, String],
    `window-page-favicon-updated`: WindowEvent[String, String],
    `window-page-title-updated`: WindowEvent[String, String],
    `window-performance-report`: WindowPerformanceReport[String, String],
    `window-responding`: WindowEvent[String, String],
    `window-start-load`: WindowEvent[String, String]
  ): PropagatedPlatformEventMapping[Topic, Type] = {
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
    __obj.asInstanceOf[PropagatedPlatformEventMapping[Topic, Type]]
  }
  
  @scala.inline
  implicit class PropagatedPlatformEventMappingOps[Self <: PropagatedPlatformEventMapping[_, _], Topic, Type] (val x: Self with (PropagatedPlatformEventMapping[Topic, Type])) extends AnyVal {
    
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
    def `setPlatform-api-ready`(value: ApplicationEvent[Topic, Type]): Self = this.set("platform-api-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlatform-snapshot-applied`(value: ApplicationEvent[Topic, Type]): Self = this.set("platform-snapshot-applied", value.asInstanceOf[js.Any])
  }
}
