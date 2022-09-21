package typings.paypalPaypalhttp

import typings.paypalPaypalhttp.httpClientMod.HttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@paypal/paypalhttp", "Encoder")
  @js.native
  open class Encoder[T /* <: js.Array[Any] */] protected ()
    extends typings.paypalPaypalhttp.paypalhttpMod.Encoder[T] {
    def this(encoders: T) = this()
  }
  
  @JSImport("@paypal/paypalhttp", "Environment")
  @js.native
  open class Environment protected ()
    extends typings.paypalPaypalhttp.paypalhttpMod.Environment {
    def this(baseUrl: String) = this()
  }
  
  @JSImport("@paypal/paypalhttp", "FormPart")
  @js.native
  open class FormPart protected ()
    extends typings.paypalPaypalhttp.paypalhttpMod.FormPart {
    def this(value: Any, headers: HttpHeaders) = this()
  }
  
  @JSImport("@paypal/paypalhttp", "HttpClient")
  @js.native
  open class HttpClient protected ()
    extends typings.paypalPaypalhttp.paypalhttpMod.HttpClient {
    def this(environment: typings.paypalPaypalhttp.environmentMod.Environment) = this()
  }
}
