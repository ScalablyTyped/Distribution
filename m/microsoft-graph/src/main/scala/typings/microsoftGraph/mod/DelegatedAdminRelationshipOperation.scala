package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminRelationshipOperation
  extends StObject
     with Entity {
  
  // The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The data (payload) for the operation. Read-only.
  var data: js.UndefOr[String] = js.undefined
  
  // The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The type of long-running operation. The possible values are: delegatedAdminAccessAssignmentUpdate, unknownFutureValue.
    * Read-only.
    */
  var operationType: js.UndefOr[DelegatedAdminRelationshipOperationType] = js.undefined
  
  /**
    * The status of the operation. Read-only. The possible values are: notStarted, running, succeeded, failed,
    * unknownFutureValue. Read-only. Supports $orderBy.
    */
  var status: js.UndefOr[LongRunningOperationStatus] = js.undefined
}
object DelegatedAdminRelationshipOperation {
  
  inline def apply(): DelegatedAdminRelationshipOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminRelationshipOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminRelationshipOperation] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setOperationType(value: DelegatedAdminRelationshipOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setStatus(value: LongRunningOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
