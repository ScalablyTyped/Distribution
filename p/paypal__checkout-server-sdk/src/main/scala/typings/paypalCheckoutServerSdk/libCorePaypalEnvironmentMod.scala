package typings.paypalCheckoutServerSdk

import typings.paypalPaypalhttp.mod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCorePaypalEnvironmentMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/paypal_environment", "LiveEnvironment")
  @js.native
  open class LiveEnvironment protected () extends PayPalEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/paypal_environment", "PayPalEnvironment")
  @js.native
  open class PayPalEnvironment protected () extends Environment {
    /**
      * @param clientId - The client id for this environment
      * @param clientSecret - The client secret
      * @param baseUrl - The base url to execute requests
      * @param webUrl - The web url to authorize user's consent
      */
    def this(clientId: String, clientSecret: String, baseUrl: String, webUrl: String) = this()
    
    /**
      * Authorization header string for basic authentication with the current client id and secret
      */
    def authorizationString(): String = js.native
    
    val clientId: String = js.native
    
    val clientSecret: String = js.native
    
    val webUrl: String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/paypal_environment", "SandboxEnvironment")
  @js.native
  open class SandboxEnvironment protected () extends PayPalEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
}
