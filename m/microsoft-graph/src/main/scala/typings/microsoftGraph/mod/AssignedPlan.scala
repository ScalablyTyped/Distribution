package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedPlan extends StObject {
  
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
  implicit class AssignedPlanMutableBuilder[Self <: AssignedPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedDateTime(value: NullableOption[String]): Self = StObject.set(x, "assignedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedDateTimeNull: Self = StObject.set(x, "assignedDateTime", null)
    
    @scala.inline
    def setAssignedDateTimeUndefined: Self = StObject.set(x, "assignedDateTime", js.undefined)
    
    @scala.inline
    def setCapabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "capabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityStatusNull: Self = StObject.set(x, "capabilityStatus", null)
    
    @scala.inline
    def setCapabilityStatusUndefined: Self = StObject.set(x, "capabilityStatus", js.undefined)
    
    @scala.inline
    def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNull: Self = StObject.set(x, "service", null)
    
    @scala.inline
    def setServicePlanId(value: NullableOption[String]): Self = StObject.set(x, "servicePlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePlanIdNull: Self = StObject.set(x, "servicePlanId", null)
    
    @scala.inline
    def setServicePlanIdUndefined: Self = StObject.set(x, "servicePlanId", js.undefined)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
