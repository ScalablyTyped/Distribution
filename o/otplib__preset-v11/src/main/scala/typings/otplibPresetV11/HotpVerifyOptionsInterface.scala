package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotpVerifyOptionsInterface extends StObject {
  
  var counter: js.UndefOr[Double] = js.undefined
  
  var secret: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object HotpVerifyOptionsInterface {
  
  inline def apply(): HotpVerifyOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotpVerifyOptionsInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HotpVerifyOptionsInterface] (val x: Self) extends AnyVal {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
