package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceManagementTroubleshootingEvent extends Entity {
  
  // Id used for tracing the failure in the service.
  var correlationId: js.UndefOr[NullableOption[String]] = js.native
  
  // Time when the event occurred .
  var eventDateTime: js.UndefOr[String] = js.native
}
object DeviceManagementTroubleshootingEvent {
  
  @scala.inline
  def apply(): DeviceManagementTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementTroubleshootingEvent]
  }
  
  @scala.inline
  implicit class DeviceManagementTroubleshootingEventOps[Self <: DeviceManagementTroubleshootingEvent] (val x: Self) extends AnyVal {
    
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
    def setCorrelationId(value: NullableOption[String]): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setCorrelationIdNull: Self = this.set("correlationId", null)
    
    @scala.inline
    def setEventDateTime(value: String): Self = this.set("eventDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDateTime: Self = this.set("eventDateTime", js.undefined)
  }
}
