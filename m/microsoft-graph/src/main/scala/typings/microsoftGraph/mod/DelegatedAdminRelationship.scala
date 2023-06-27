package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminRelationship
  extends StObject
     with Entity {
  
  // The access assignments associated with the delegated admin relationship.
  var accessAssignments: js.UndefOr[NullableOption[js.Array[DelegatedAdminAccessAssignment]]] = js.undefined
  
  /**
    * The access details that contain the identifiers of the administrative roles that the partner admin is requesting in the
    * customer tenant.
    */
  var accessDetails: js.UndefOr[DelegatedAdminAccessDetails] = js.undefined
  
  // The date and time in ISO 8601 format and in UTC time when the relationship became active. Read-only.
  var activatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time in ISO 8601 format and in UTC time when the relationship was created. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The display name and unique identifier of the customer of the relationship. This is configured either by the partner at
    * the time the relationship is created or by the system after the customer approves the relationship. Cannot be changed
    * by the customer.
    */
  var customer: js.UndefOr[NullableOption[DelegatedAdminRelationshipCustomerParticipant]] = js.undefined
  
  /**
    * The display name of the relationship used for ease of identification. Must be unique across all delegated admin
    * relationships of the partner. This is set by the partner only when the relationship is in the created status and cannot
    * be changed by the customer.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The duration of the relationship in ISO 8601 format. Must be a value between P1D and P2Y inclusive. This is set by the
    * partner only when the relationship is in the created status and cannot be changed by the customer.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time in ISO 8601 format and in UTC time when the status of relationship changes to either terminated or
    * expired. Calculated as endDateTime = activatedDateTime + duration. Read-only.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time in ISO 8601 format and in UTC time when the relationship was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The long running operations associated with the delegated admin relationship.
  var operations: js.UndefOr[NullableOption[js.Array[DelegatedAdminRelationshipOperation]]] = js.undefined
  
  // The requests associated with the delegated admin relationship.
  var requests: js.UndefOr[NullableOption[js.Array[DelegatedAdminRelationshipRequest]]] = js.undefined
  
  /**
    * The status of the relationship. Read Only. The possible values are: activating, active, approvalPending, approved,
    * created, expired, expiring, terminated, terminating, terminationRequested, unknownFutureValue. Supports $orderBy.
    */
  var status: js.UndefOr[NullableOption[DelegatedAdminRelationshipStatus]] = js.undefined
}
object DelegatedAdminRelationship {
  
  inline def apply(): DelegatedAdminRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminRelationship] (val x: Self) extends AnyVal {
    
    inline def setAccessAssignments(value: NullableOption[js.Array[DelegatedAdminAccessAssignment]]): Self = StObject.set(x, "accessAssignments", value.asInstanceOf[js.Any])
    
    inline def setAccessAssignmentsNull: Self = StObject.set(x, "accessAssignments", null)
    
    inline def setAccessAssignmentsUndefined: Self = StObject.set(x, "accessAssignments", js.undefined)
    
    inline def setAccessAssignmentsVarargs(value: DelegatedAdminAccessAssignment*): Self = StObject.set(x, "accessAssignments", js.Array(value*))
    
    inline def setAccessDetails(value: DelegatedAdminAccessDetails): Self = StObject.set(x, "accessDetails", value.asInstanceOf[js.Any])
    
    inline def setAccessDetailsUndefined: Self = StObject.set(x, "accessDetails", js.undefined)
    
    inline def setActivatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "activatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setActivatedDateTimeNull: Self = StObject.set(x, "activatedDateTime", null)
    
    inline def setActivatedDateTimeUndefined: Self = StObject.set(x, "activatedDateTime", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCustomer(value: NullableOption[DelegatedAdminRelationshipCustomerParticipant]): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[DelegatedAdminRelationshipOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: DelegatedAdminRelationshipOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setRequests(value: NullableOption[js.Array[DelegatedAdminRelationshipRequest]]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsNull: Self = StObject.set(x, "requests", null)
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: DelegatedAdminRelationshipRequest*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setStatus(value: NullableOption[DelegatedAdminRelationshipStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
