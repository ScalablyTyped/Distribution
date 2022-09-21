package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAssignment
  extends StObject
     with Entity {
  
  // Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
  var accessPackage: js.UndefOr[NullableOption[AccessPackage]] = js.undefined
  
  // Read-only. Supports $filter (eq) on the id property and $expand query parameters.
  var assignmentPolicy: js.UndefOr[NullableOption[AccessPackageAssignmentPolicy]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var expiredDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When the access assignment is to be in place. Read-only.
  var schedule: js.UndefOr[NullableOption[EntitlementManagementSchedule]] = js.undefined
  
  /**
    * The state of the access package assignment. The possible values are: delivering, partiallyDelivered, delivered,
    * expired, deliveryFailed, unknownFutureValue. Read-only. Supports $filter (eq).
    */
  var state: js.UndefOr[NullableOption[AccessPackageAssignmentState]] = js.undefined
  
  /**
    * More information about the assignment lifecycle. Possible values include Delivering, Delivered,
    * NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered. Read-only.
    */
  var status: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
  var target: js.UndefOr[NullableOption[AccessPackageSubject]] = js.undefined
}
object AccessPackageAssignment {
  
  inline def apply(): AccessPackageAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAssignment]
  }
  
  extension [Self <: AccessPackageAssignment](x: Self) {
    
    inline def setAccessPackage(value: NullableOption[AccessPackage]): Self = StObject.set(x, "accessPackage", value.asInstanceOf[js.Any])
    
    inline def setAccessPackageNull: Self = StObject.set(x, "accessPackage", null)
    
    inline def setAccessPackageUndefined: Self = StObject.set(x, "accessPackage", js.undefined)
    
    inline def setAssignmentPolicy(value: NullableOption[AccessPackageAssignmentPolicy]): Self = StObject.set(x, "assignmentPolicy", value.asInstanceOf[js.Any])
    
    inline def setAssignmentPolicyNull: Self = StObject.set(x, "assignmentPolicy", null)
    
    inline def setAssignmentPolicyUndefined: Self = StObject.set(x, "assignmentPolicy", js.undefined)
    
    inline def setExpiredDateTime(value: NullableOption[String]): Self = StObject.set(x, "expiredDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpiredDateTimeNull: Self = StObject.set(x, "expiredDateTime", null)
    
    inline def setExpiredDateTimeUndefined: Self = StObject.set(x, "expiredDateTime", js.undefined)
    
    inline def setSchedule(value: NullableOption[EntitlementManagementSchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setState(value: NullableOption[AccessPackageAssignmentState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: NullableOption[AccessPackageSubject]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
