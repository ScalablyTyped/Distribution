package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminRelationshipRequest
  extends StObject
     with Entity {
  
  // The action to be performed on the delegated admin relationship.
  var action: js.UndefOr[DelegatedAdminRelationshipRequestAction] = js.undefined
  
  // The date and time in ISO 8601 format and in UTC time when the relationship request was created. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time in ISO 8601 format and UTC time when this relationship request was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The status of the request. Read-only. The possible values are: created, pending, succeeded, failed, unknownFutureValue.
  var status: js.UndefOr[NullableOption[DelegatedAdminRelationshipRequestStatus]] = js.undefined
}
object DelegatedAdminRelationshipRequest {
  
  inline def apply(): DelegatedAdminRelationshipRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminRelationshipRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminRelationshipRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: DelegatedAdminRelationshipRequestAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[DelegatedAdminRelationshipRequestStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
