package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request
  extends StObject
     with Entity {
  
  // The identifier of the approval of the request.
  var approvalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The request completion date time.
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The principal that created the request.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The request creation date time.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Free text field to define any custom data for the request. Not used.
  var customData: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The status of the request. Not nullable. The possible values are: Canceled, Denied, Failed, Granted,
    * PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and
    * ScheduleCreated. Not nullable.
    */
  var status: js.UndefOr[String] = js.undefined
}
object Request {
  
  inline def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setApprovalId(value: NullableOption[String]): Self = StObject.set(x, "approvalId", value.asInstanceOf[js.Any])
    
    inline def setApprovalIdNull: Self = StObject.set(x, "approvalId", null)
    
    inline def setApprovalIdUndefined: Self = StObject.set(x, "approvalId", js.undefined)
    
    inline def setCompletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCustomData(value: NullableOption[String]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataNull: Self = StObject.set(x, "customData", null)
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
