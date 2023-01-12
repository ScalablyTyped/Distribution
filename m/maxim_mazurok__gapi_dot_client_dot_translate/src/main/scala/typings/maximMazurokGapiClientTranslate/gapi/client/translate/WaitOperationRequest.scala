package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitOperationRequest extends StObject {
  
  /**
    * The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also
    * specified, the shorter one will be used.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object WaitOperationRequest {
  
  inline def apply(): WaitOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitOperationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
