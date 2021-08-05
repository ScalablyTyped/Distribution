package typings.openidClient.mod

import typings.jose.mod.JSONWebKeySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterOther extends StObject {
  
  /**
    * Initial Access Token to use as a Bearer token during the registration call.
    */
  var initialAccessToken: js.UndefOr[String] = js.undefined
  
  /**
    * JWK Set formatted object with private keys used for signing client assertions or decrypting responses.
    * When neither jwks_uri or jwks is present in metadata the key's public parts will be registered as jwks.
    */
  var jwks: js.UndefOr[JSONWebKeySet] = js.undefined
}
object RegisterOther {
  
  inline def apply(): RegisterOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOther]
  }
  
  extension [Self <: RegisterOther](x: Self) {
    
    inline def setInitialAccessToken(value: String): Self = StObject.set(x, "initialAccessToken", value.asInstanceOf[js.Any])
    
    inline def setInitialAccessTokenUndefined: Self = StObject.set(x, "initialAccessToken", js.undefined)
    
    inline def setJwks(value: JSONWebKeySet): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
  }
}
