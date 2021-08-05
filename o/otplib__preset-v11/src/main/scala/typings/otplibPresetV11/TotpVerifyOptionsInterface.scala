package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotpVerifyOptionsInterface extends StObject {
  
  var secret: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object TotpVerifyOptionsInterface {
  
  inline def apply(): TotpVerifyOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotpVerifyOptionsInterface]
  }
  
  extension [Self <: TotpVerifyOptionsInterface](x: Self) {
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
