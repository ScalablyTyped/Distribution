package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryAudit
  extends StObject
     with Entity {
  
  /**
    * Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight
    * UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var activityDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list,
    * see Azure AD activity list.
    */
  var activityDisplayName: js.UndefOr[String] = js.undefined
  
  // Indicates additional details on the activity.
  var additionalDetails: js.UndefOr[NullableOption[js.Array[KeyValue]]] = js.undefined
  
  /**
    * Indicates which resource category that's targeted by the activity. (For example: User Management, Group Management
    * etc..)
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs
    * across services.
    */
  var correlationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates information about the user or app initiated the activity.
  var initiatedBy: js.UndefOr[AuditActivityInitiator] = js.undefined
  
  /**
    * Indicates information on which service initiated the activity (For example: Self-service Password Management, Core
    * Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
    */
  var loggedByService: js.UndefOr[NullableOption[String]] = js.undefined
  
  var operationType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue.
  var result: js.UndefOr[NullableOption[OperationResult]] = js.undefined
  
  // Describes cause of 'failure' or 'timeout' results.
  var resultReason: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device,
    * Directory, App, Role, Group, Policy or Other.
    */
  var targetResources: js.UndefOr[NullableOption[js.Array[TargetResource]]] = js.undefined
}
object DirectoryAudit {
  
  @scala.inline
  def apply(): DirectoryAudit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryAudit]
  }
  
  @scala.inline
  implicit class DirectoryAuditMutableBuilder[Self <: DirectoryAudit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityDateTime(value: String): Self = StObject.set(x, "activityDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityDateTimeUndefined: Self = StObject.set(x, "activityDateTime", js.undefined)
    
    @scala.inline
    def setActivityDisplayName(value: String): Self = StObject.set(x, "activityDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityDisplayNameUndefined: Self = StObject.set(x, "activityDisplayName", js.undefined)
    
    @scala.inline
    def setAdditionalDetails(value: NullableOption[js.Array[KeyValue]]): Self = StObject.set(x, "additionalDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDetailsNull: Self = StObject.set(x, "additionalDetails", null)
    
    @scala.inline
    def setAdditionalDetailsUndefined: Self = StObject.set(x, "additionalDetails", js.undefined)
    
    @scala.inline
    def setAdditionalDetailsVarargs(value: KeyValue*): Self = StObject.set(x, "additionalDetails", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: NullableOption[String]): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    @scala.inline
    def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    @scala.inline
    def setInitiatedBy(value: AuditActivityInitiator): Self = StObject.set(x, "initiatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatedByUndefined: Self = StObject.set(x, "initiatedBy", js.undefined)
    
    @scala.inline
    def setLoggedByService(value: NullableOption[String]): Self = StObject.set(x, "loggedByService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggedByServiceNull: Self = StObject.set(x, "loggedByService", null)
    
    @scala.inline
    def setLoggedByServiceUndefined: Self = StObject.set(x, "loggedByService", js.undefined)
    
    @scala.inline
    def setOperationType(value: NullableOption[String]): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setResult(value: NullableOption[OperationResult]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultNull: Self = StObject.set(x, "result", null)
    
    @scala.inline
    def setResultReason(value: NullableOption[String]): Self = StObject.set(x, "resultReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultReasonNull: Self = StObject.set(x, "resultReason", null)
    
    @scala.inline
    def setResultReasonUndefined: Self = StObject.set(x, "resultReason", js.undefined)
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setTargetResources(value: NullableOption[js.Array[TargetResource]]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourcesNull: Self = StObject.set(x, "targetResources", null)
    
    @scala.inline
    def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    @scala.inline
    def setTargetResourcesVarargs(value: TargetResource*): Self = StObject.set(x, "targetResources", js.Array(value :_*))
  }
}
