package typings.paypalPaypalhttp

import typings.paypalPaypalhttp.libPaypalhttpHttpClientMod.HttpRequest
import typings.paypalPaypalhttp.libPaypalhttpSerializerSerializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaypalhttpSerializerJsonMod {
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp/serializer/json", "Json")
  @js.native
  open class Json () extends Serializer {
    
    def decode(body: String): js.Object = js.native
    
    def encode(request: HttpRequest[js.Object]): String = js.native
  }
}
