package typings.openidClient.mod

import typings.openidClient.anon.Keys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterOther extends StObject {
  
  var initialAccessToken: js.UndefOr[String] = js.undefined
  
  var jwks: js.UndefOr[Keys] = js.undefined
}
object RegisterOther {
  
  inline def apply(): RegisterOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOther]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterOther] (val x: Self) extends AnyVal {
    
    inline def setInitialAccessToken(value: String): Self = StObject.set(x, "initialAccessToken", value.asInstanceOf[js.Any])
    
    inline def setInitialAccessTokenUndefined: Self = StObject.set(x, "initialAccessToken", js.undefined)
    
    inline def setJwks(value: Keys): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
  }
}
