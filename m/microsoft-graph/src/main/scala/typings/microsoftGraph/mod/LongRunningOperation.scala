package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRunningOperation
  extends StObject
     with Entity {
  
  // The start time of the operation.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time of the last action in the operation.
  var lastActionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URI of the resource that the operation is performed on.
  var resourceLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The status of the operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
  var status: js.UndefOr[NullableOption[LongRunningOperationStatus]] = js.undefined
  
  // Details about the status of the operation.
  var statusDetail: js.UndefOr[NullableOption[String]] = js.undefined
}
object LongRunningOperation {
  
  inline def apply(): LongRunningOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRunningOperation]
  }
  
  extension [Self <: LongRunningOperation](x: Self) {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setLastActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastActionDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastActionDateTimeNull: Self = StObject.set(x, "lastActionDateTime", null)
    
    inline def setLastActionDateTimeUndefined: Self = StObject.set(x, "lastActionDateTime", js.undefined)
    
    inline def setResourceLocation(value: NullableOption[String]): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    inline def setResourceLocationNull: Self = StObject.set(x, "resourceLocation", null)
    
    inline def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
    
    inline def setStatus(value: NullableOption[LongRunningOperationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetail(value: NullableOption[String]): Self = StObject.set(x, "statusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailNull: Self = StObject.set(x, "statusDetail", null)
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "statusDetail", js.undefined)
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
