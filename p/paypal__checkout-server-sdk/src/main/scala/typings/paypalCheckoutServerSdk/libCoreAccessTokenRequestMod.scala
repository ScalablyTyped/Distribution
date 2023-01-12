package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreAccessTokenRequestMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/access_token_request", "AccessTokenRequest")
  @js.native
  open class AccessTokenRequest protected () extends StObject {
    def this(environment: PayPalEnvironment) = this()
    def this(environment: PayPalEnvironment, refreshToken: String) = this()
    
    val body: String = js.native
    
    val headers: AccessTokenRequestHeaders = js.native
    
    val path: String = js.native
    
    val verb: String = js.native
  }
  
  trait AccessTokenRequestHeaders extends StObject {
    
    var Authorization: String
    
    var `Content-Type`: String
  }
  object AccessTokenRequestHeaders {
    
    inline def apply(Authorization: String, `Content-Type`: String): AccessTokenRequestHeaders = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenRequestHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessTokenRequestHeaders] (val x: Self) extends AnyVal {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    }
  }
}
