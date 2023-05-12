package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminAccessAssignment
  extends StObject
     with Entity {
  
  // The access container through which members are assigned access. For example, a security group.
  var accessContainer: js.UndefOr[DelegatedAdminAccessContainer] = js.undefined
  
  /**
    * The access details containing the identifiers of the administrative roles that the partner is assigned in the customer
    * tenant.
    */
  var accessDetails: js.UndefOr[DelegatedAdminAccessDetails] = js.undefined
  
  // The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error,
    * unknownFutureValue.
    */
  var status: js.UndefOr[NullableOption[DelegatedAdminAccessAssignmentStatus]] = js.undefined
}
object DelegatedAdminAccessAssignment {
  
  inline def apply(): DelegatedAdminAccessAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminAccessAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminAccessAssignment] (val x: Self) extends AnyVal {
    
    inline def setAccessContainer(value: DelegatedAdminAccessContainer): Self = StObject.set(x, "accessContainer", value.asInstanceOf[js.Any])
    
    inline def setAccessContainerUndefined: Self = StObject.set(x, "accessContainer", js.undefined)
    
    inline def setAccessDetails(value: DelegatedAdminAccessDetails): Self = StObject.set(x, "accessDetails", value.asInstanceOf[js.Any])
    
    inline def setAccessDetailsUndefined: Self = StObject.set(x, "accessDetails", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[DelegatedAdminAccessAssignmentStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
