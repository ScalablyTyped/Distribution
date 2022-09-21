package typings.paypalPaypalhttp

import typings.paypalPaypalhttp.httpClientMod.HttpRequest
import typings.paypalPaypalhttp.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formEncodedMod {
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp/serializer/form_encoded", "FormEncoded")
  @js.native
  open class FormEncoded () extends Serializer {
    
    def decode(): js.Error = js.native
    
    def encode(request: HttpRequest[js.Object]): String = js.native
  }
}
