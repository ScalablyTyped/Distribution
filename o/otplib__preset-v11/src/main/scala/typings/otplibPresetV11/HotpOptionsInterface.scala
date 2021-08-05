package typings.otplibPresetV11

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotpOptionsInterface
  extends StObject
     with HmacOptions {
  
  var createHmacSecret: js.UndefOr[typings.otplibPresetV11.createHmacSecret] = js.undefined
  
  var crypto: js.UndefOr[js.Any] = js.undefined
  
  var digits: js.UndefOr[Double] = js.undefined
}
object HotpOptionsInterface {
  
  inline def apply(): HotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotpOptionsInterface]
  }
  
  extension [Self <: HotpOptionsInterface](x: Self) {
    
    inline def setCreateHmacSecret(value: (/* secret */ String, /* options */ HmacOptions) => Buffer): Self = StObject.set(x, "createHmacSecret", js.Any.fromFunction2(value))
    
    inline def setCreateHmacSecretUndefined: Self = StObject.set(x, "createHmacSecret", js.undefined)
    
    inline def setCrypto(value: js.Any): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    inline def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
    
    inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
  }
}
