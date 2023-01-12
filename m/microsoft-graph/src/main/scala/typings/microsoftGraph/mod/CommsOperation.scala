package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommsOperation
  extends StObject
     with Entity {
  
  // Unique Client Context string. Max limit is 256 chars.
  var clientContext: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The result information. Read-only.
  var resultInfo: js.UndefOr[NullableOption[ResultInfo]] = js.undefined
  
  // Possible values are: notStarted, running, completed, failed. Read-only.
  var status: js.UndefOr[OperationStatus] = js.undefined
}
object CommsOperation {
  
  inline def apply(): CommsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommsOperation] (val x: Self) extends AnyVal {
    
    inline def setClientContext(value: NullableOption[String]): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
    
    inline def setClientContextNull: Self = StObject.set(x, "clientContext", null)
    
    inline def setClientContextUndefined: Self = StObject.set(x, "clientContext", js.undefined)
    
    inline def setResultInfo(value: NullableOption[ResultInfo]): Self = StObject.set(x, "resultInfo", value.asInstanceOf[js.Any])
    
    inline def setResultInfoNull: Self = StObject.set(x, "resultInfo", null)
    
    inline def setResultInfoUndefined: Self = StObject.set(x, "resultInfo", js.undefined)
    
    inline def setStatus(value: OperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
