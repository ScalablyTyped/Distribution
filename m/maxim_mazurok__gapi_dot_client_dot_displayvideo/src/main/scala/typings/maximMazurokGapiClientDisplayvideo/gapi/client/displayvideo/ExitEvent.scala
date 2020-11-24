package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExitEvent extends js.Object {
  
  /** The name of the click tag of the exit event. The name must be unique within one creative. Leave it empty or unset for creatives containing image assets only. */
  var name: js.UndefOr[String] = js.native
  
  /** The name used to identify this event in reports. Leave it empty or unset for creatives containing image assets only. */
  var reportingName: js.UndefOr[String] = js.native
  
  /** Required. The type of the exit event. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Required. The click through URL of the exit event. This is required when type is: * `EXIT_EVENT_TYPE_DEFAULT` * `EXIT_EVENT_TYPE_BACKUP` */
  var url: js.UndefOr[String] = js.native
}
object ExitEvent {
  
  @scala.inline
  def apply(): ExitEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitEvent]
  }
  
  @scala.inline
  implicit class ExitEventOps[Self <: ExitEvent] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReportingName(value: String): Self = this.set("reportingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportingName: Self = this.set("reportingName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
