package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationStatus extends StObject {
  
  /** Output only. Whether the operation is done or still in progress. */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /** The error code in case of failures. */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /** The human-readable error message. */
  var errorMessage: js.UndefOr[String] = js.undefined
}
object OperationStatus {
  
  inline def apply(): OperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationStatus]
  }
  
  extension [Self <: OperationStatus](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
