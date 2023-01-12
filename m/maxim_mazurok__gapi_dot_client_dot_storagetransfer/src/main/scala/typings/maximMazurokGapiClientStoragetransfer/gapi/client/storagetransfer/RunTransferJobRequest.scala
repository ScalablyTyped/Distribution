package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunTransferJobRequest extends StObject {
  
  /** Required. The ID of the Google Cloud project that owns the transfer job. */
  var projectId: js.UndefOr[String] = js.undefined
}
object RunTransferJobRequest {
  
  inline def apply(): RunTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunTransferJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunTransferJobRequest] (val x: Self) extends AnyVal {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
