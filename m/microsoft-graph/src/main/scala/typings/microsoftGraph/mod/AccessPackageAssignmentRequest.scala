package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAssignmentRequest
  extends StObject
     with Entity {
  
  /**
    * The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of
    * resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable.
    * Supports $expand.
    */
  var accessPackage: js.UndefOr[NullableOption[AccessPackage]] = js.undefined
  
  // Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
  var answers: js.UndefOr[NullableOption[js.Array[AccessPackageAnswer]]] = js.undefined
  
  /**
    * For a requestType of userAdd or adminAdd, this is an access package assignment requested to be created. For a
    * requestType of userRemove, adminRemove or systemRemove, this has the id property of an existing assignment to be
    * removed. Supports $expand.
    */
  var assignment: js.UndefOr[NullableOption[AccessPackageAssignment]] = js.undefined
  
  /**
    * The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and
    * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z. Read-only.
    */
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of the request. The possible values are: notSpecified, userAdd, UserExtend, userUpdate, userRemove, adminAdd,
    * adminUpdate, adminRemove, systemAdd, systemUpdate, systemRemove, onBehalfAdd (not supported), unknownFutureValue. A
    * request from the user themselves would have requestType of userAdd, userUpdate or userRemove. This property cannot be
    * changed once set.
    */
  var requestType: js.UndefOr[NullableOption[AccessPackageRequestType]] = js.undefined
  
  // The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
  var requestor: js.UndefOr[NullableOption[AccessPackageSubject]] = js.undefined
  
  // The range of dates that access is to be assigned to the requestor. This property cannot be changed once set.
  var schedule: js.UndefOr[NullableOption[EntitlementManagementSchedule]] = js.undefined
  
  /**
    * The state of the request. The possible values are: submitted, pendingApproval, delivering, delivered, deliveryFailed,
    * denied, scheduled, canceled, partiallyDelivered, unknownFutureValue. Read-only. Supports $filter (eq).
    */
  var state: js.UndefOr[NullableOption[AccessPackageRequestState]] = js.undefined
  
  // More information on the request processing status. Read-only.
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackageAssignmentRequest {
  
  inline def apply(): AccessPackageAssignmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAssignmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageAssignmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessPackage(value: NullableOption[AccessPackage]): Self = StObject.set(x, "accessPackage", value.asInstanceOf[js.Any])
    
    inline def setAccessPackageNull: Self = StObject.set(x, "accessPackage", null)
    
    inline def setAccessPackageUndefined: Self = StObject.set(x, "accessPackage", js.undefined)
    
    inline def setAnswers(value: NullableOption[js.Array[AccessPackageAnswer]]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersNull: Self = StObject.set(x, "answers", null)
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: AccessPackageAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
    
    inline def setAssignment(value: NullableOption[AccessPackageAssignment]): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    inline def setAssignmentNull: Self = StObject.set(x, "assignment", null)
    
    inline def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
    
    inline def setCompletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setRequestType(value: NullableOption[AccessPackageRequestType]): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeNull: Self = StObject.set(x, "requestType", null)
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setRequestor(value: NullableOption[AccessPackageSubject]): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRequestorNull: Self = StObject.set(x, "requestor", null)
    
    inline def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    inline def setSchedule(value: NullableOption[EntitlementManagementSchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setState(value: NullableOption[AccessPackageRequestState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
