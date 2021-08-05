package typings.phonegapFacebookPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: String
    
    var expiresIn: String
    
    var secret: String
    
    var session_key: Boolean
    
    var sig: String
    
    var userID: String
  }
  object AccessToken {
    
    inline def apply(
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
    
    extension [Self <: AccessToken](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSession_key(value: Boolean): Self = StObject.set(x, "session_key", value.asInstanceOf[js.Any])
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    }
  }
}
