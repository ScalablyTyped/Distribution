package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenIDCallbackChecks
  extends StObject
     with OAuthCallbackChecks {
  
  var max_age: js.UndefOr[Double] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
}
object OpenIDCallbackChecks {
  
  inline def apply(): OpenIDCallbackChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIDCallbackChecks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenIDCallbackChecks] (val x: Self) extends AnyVal {
    
    inline def setMax_age(value: Double): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    inline def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
  }
}
