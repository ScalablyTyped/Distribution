package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedPlan extends StObject {
  
  /**
    * The date and time at which the plan was assigned; for example: 2013-01-02T19:32:30Z. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the service; for example, 'Exchange'.
  var service: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A GUID that identifies the service plan.
  var servicePlanId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AssignedPlan {
  
  inline def apply(): AssignedPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedPlan]
  }
  
  extension [Self <: AssignedPlan](x: Self) {
    
    inline def setAssignedDateTime(value: NullableOption[String]): Self = StObject.set(x, "assignedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAssignedDateTimeNull: Self = StObject.set(x, "assignedDateTime", null)
    
    inline def setAssignedDateTimeUndefined: Self = StObject.set(x, "assignedDateTime", js.undefined)
    
    inline def setCapabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "capabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setCapabilityStatusNull: Self = StObject.set(x, "capabilityStatus", null)
    
    inline def setCapabilityStatusUndefined: Self = StObject.set(x, "capabilityStatus", js.undefined)
    
    inline def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServicePlanId(value: NullableOption[String]): Self = StObject.set(x, "servicePlanId", value.asInstanceOf[js.Any])
    
    inline def setServicePlanIdNull: Self = StObject.set(x, "servicePlanId", null)
    
    inline def setServicePlanIdUndefined: Self = StObject.set(x, "servicePlanId", js.undefined)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
