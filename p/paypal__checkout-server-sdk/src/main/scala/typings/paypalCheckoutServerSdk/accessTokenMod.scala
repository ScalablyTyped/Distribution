package typings.paypalCheckoutServerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessTokenMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/access_token", "AccessToken")
  @js.native
  open class AccessToken protected () extends StObject {
    def this(options: AccessTokenOptions) = this()
    
    /**
      * Get the value of an Authorization header with the current access token
      */
    def authorizationString(): String = js.native
    
    /**
      * Get the expiration status of the token
      */
    def isExpired(): Boolean = js.native
  }
  
  trait AccessTokenOptions extends StObject {
    
    /**
      * The access token
      */
    var access_token: String
    
    /**
      * The token type
      */
    var expires_in: Double
    
    /**
      * The refresh token if any to refresh the current token
      */
    var refresh_token: String
    
    /**
      * The duration of the token in milliseconds
      */
    var token_type: String
  }
  object AccessTokenOptions {
    
    inline def apply(access_token: String, expires_in: Double, refresh_token: String, token_type: String): AccessTokenOptions = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenOptions]
    }
    
    extension [Self <: AccessTokenOptions](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
}
