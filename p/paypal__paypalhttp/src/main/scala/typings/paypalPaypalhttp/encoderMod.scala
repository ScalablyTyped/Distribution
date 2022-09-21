package typings.paypalPaypalhttp

import typings.node.bufferMod.global.Buffer
import typings.paypalPaypalhttp.httpClientMod.HttpHeaders
import typings.paypalPaypalhttp.httpClientMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoderMod {
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp/encoder", "Encoder")
  @js.native
  open class Encoder[T /* <: js.Array[Any] */] protected () extends StObject {
    def this(encoders: T) = this()
    
    def deserializeResponse(responseBody: Any, headers: HttpHeaders): Any = js.native
    
    def serializeRequest(request: HttpRequest[js.Object]): Buffer = js.native
    
    def supportedEncodings(): String = js.native
  }
}
