package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation
  extends StObject
     with Entity {
  
  // The start time of the operation.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time of the last action of the operation.
  var lastActionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The current status of the operation: notStarted, running, completed, failed
  var status: js.UndefOr[NullableOption[OperationStatus]] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setLastActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastActionDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastActionDateTimeNull: Self = StObject.set(x, "lastActionDateTime", null)
    
    inline def setLastActionDateTimeUndefined: Self = StObject.set(x, "lastActionDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[OperationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
