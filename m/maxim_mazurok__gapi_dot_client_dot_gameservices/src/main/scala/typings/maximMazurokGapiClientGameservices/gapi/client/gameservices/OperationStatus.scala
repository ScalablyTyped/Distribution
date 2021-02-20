package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationStatus extends StObject {
  
  /** Output only. Whether the operation is done or still in progress. */
  var done: js.UndefOr[Boolean] = js.native
  
  /** The error code in case of failures. */
  var errorCode: js.UndefOr[String] = js.native
  
  /** The human-readable error message. */
  var errorMessage: js.UndefOr[String] = js.native
}
object OperationStatus {
  
  @scala.inline
  def apply(): OperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationStatus]
  }
  
  @scala.inline
  implicit class OperationStatusMutableBuilder[Self <: OperationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
