package typings.paypalPaypalhttp

import typings.paypalPaypalhttp.libPaypalhttpHttpClientMod.HttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaypalhttpMod {
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp", "Encoder")
  @js.native
  open class Encoder[T /* <: js.Array[Any] */] protected ()
    extends typings.paypalPaypalhttp.libPaypalhttpEncoderMod.Encoder[T] {
    def this(encoders: T) = this()
  }
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp", "Environment")
  @js.native
  open class Environment protected ()
    extends typings.paypalPaypalhttp.libPaypalhttpEnvironmentMod.Environment {
    def this(baseUrl: String) = this()
  }
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp", "FormPart")
  @js.native
  open class FormPart protected ()
    extends typings.paypalPaypalhttp.libPaypalhttpSerializerMultipartMod.FormPart {
    def this(value: Any, headers: HttpHeaders) = this()
  }
  
  @JSImport("@paypal/paypalhttp/lib/paypalhttp", "HttpClient")
  @js.native
  open class HttpClient protected ()
    extends typings.paypalPaypalhttp.libPaypalhttpHttpClientMod.HttpClient {
    def this(environment: typings.paypalPaypalhttp.libPaypalhttpEnvironmentMod.Environment) = this()
  }
}
