package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainState extends StObject {
  
  /**
    * Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the asynchronous
    * task starts, and when the operation completes.
    */
  var lastActionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Type of asynchronous operation. The values can be ForceDelete or Verification
  var operation: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Current status of the operation. Scheduled - Operation has been scheduled but has not started. InProgress - Task has
    * started and is in progress. Failed - Operation has failed.
    */
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object DomainState {
  
  inline def apply(): DomainState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainState]
  }
  
  extension [Self <: DomainState](x: Self) {
    
    inline def setLastActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastActionDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastActionDateTimeNull: Self = StObject.set(x, "lastActionDateTime", null)
    
    inline def setLastActionDateTimeUndefined: Self = StObject.set(x, "lastActionDateTime", js.undefined)
    
    inline def setOperation(value: NullableOption[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
