package typings.phonegapFacebookPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessToken extends StObject {
    
    var accessToken: String = js.native
    
    var expiresIn: String = js.native
    
    var secret: String = js.native
    
    var session_key: Boolean = js.native
    
    var sig: String = js.native
    
    var userID: String = js.native
  }
  object AccessToken {
    
    @scala.inline
    def apply(
      accessToken: String,
      expiresIn: String,
      secret: String,
      session_key: Boolean,
      sig: String,
      userID: String
    ): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], session_key = session_key.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_key(value: Boolean): Self = StObject.set(x, "session_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    }
  }
}
