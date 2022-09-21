package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRuntimeRequest extends StObject {
  
  /** Idempotent request UUID. */
  var requestId: js.UndefOr[String] = js.undefined
}
object StopRuntimeRequest {
  
  inline def apply(): StopRuntimeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRuntimeRequest]
  }
  
  extension [Self <: StopRuntimeRequest](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
