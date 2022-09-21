package typings.paypalPaypalhttp

import typings.paypalPaypalhttp.httpClientMod.HttpRequest
import typings.paypalPaypalhttp.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp/serializer/text", "Text")
  @js.native
  open class Text () extends Serializer {
    
    def decode(body: Any): String = js.native
    
    def encode(request: HttpRequest[js.Object]): String = js.native
  }
}
