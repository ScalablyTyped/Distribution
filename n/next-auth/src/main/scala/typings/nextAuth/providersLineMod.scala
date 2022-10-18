package typings.nextAuth

import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersLineMod {
  
  @JSImport("next-auth/providers/line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: LineProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait LineProfile extends StObject {
    
    var amr: js.Array[String]
    
    var aud: String
    
    var exp: Double
    
    var iat: Double
    
    var iss: String
    
    var name: String
    
    var picture: String
    
    var sub: String
    
    var user: Any
  }
  object LineProfile {
    
    inline def apply(
      amr: js.Array[String],
      aud: String,
      exp: Double,
      iat: Double,
      iss: String,
      name: String,
      picture: String,
      sub: String,
      user: Any
    ): LineProfile = {
      val __obj = js.Dynamic.literal(amr = amr.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProfile]
    }
    
    extension [Self <: LineProfile](x: Self) {
      
      inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
      
      inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
