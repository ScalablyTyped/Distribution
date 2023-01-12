package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetRuntimeRequest extends StObject {
  
  /** Idempotent request UUID. */
  var requestId: js.UndefOr[String] = js.undefined
}
object ResetRuntimeRequest {
  
  inline def apply(): ResetRuntimeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetRuntimeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetRuntimeRequest] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
