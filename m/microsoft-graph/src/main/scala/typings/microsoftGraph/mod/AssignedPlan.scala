package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedPlan extends js.Object {
  
  /**
    * The date and time at which the plan was assigned; for example: 2013-01-02T19:32:30Z. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the service; for example, 'Exchange'.
  var service: js.UndefOr[NullableOption[String]] = js.native
  
  // A GUID that identifies the service plan.
  var servicePlanId: js.UndefOr[NullableOption[String]] = js.native
}
object AssignedPlan {
  
  @scala.inline
  def apply(): AssignedPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedPlan]
  }
  
  @scala.inline
  implicit class AssignedPlanOps[Self <: AssignedPlan] (val x: Self) extends AnyVal {
    
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
    def setAssignedDateTime(value: NullableOption[String]): Self = this.set("assignedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedDateTime: Self = this.set("assignedDateTime", js.undefined)
    
    @scala.inline
    def setAssignedDateTimeNull: Self = this.set("assignedDateTime", null)
    
    @scala.inline
    def setCapabilityStatus(value: NullableOption[String]): Self = this.set("capabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilityStatus: Self = this.set("capabilityStatus", js.undefined)
    
    @scala.inline
    def setCapabilityStatusNull: Self = this.set("capabilityStatus", null)
    
    @scala.inline
    def setService(value: NullableOption[String]): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setServiceNull: Self = this.set("service", null)
    
    @scala.inline
    def setServicePlanId(value: NullableOption[String]): Self = this.set("servicePlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePlanId: Self = this.set("servicePlanId", js.undefined)
    
    @scala.inline
    def setServicePlanIdNull: Self = this.set("servicePlanId", null)
  }
}
