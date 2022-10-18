package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment
import typings.paypalPaypalhttp.libPaypalhttpHttpClientMod.HttpResponse
import typings.paypalPaypalhttp.mod.HttpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCorePaypalHttpClientMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/paypal_http_client", "PayPalHttpClient")
  @js.native
  open class PayPalHttpClient protected () extends HttpClient {
    /**
      * @param environment - The environment for this client
      * @param refreshToken - The refreshToken to be used to generate the access Token.
      */
    def this(environment: PayPalEnvironment) = this()
    def this(environment: PayPalEnvironment, refreshToken: String) = this()
    
    def execute(req: Any): js.Promise[HttpResponse[Any]] = js.native
    
    def fetchAccessToken(): String = js.native
    
    val refreshToken: String = js.native
  }
}
