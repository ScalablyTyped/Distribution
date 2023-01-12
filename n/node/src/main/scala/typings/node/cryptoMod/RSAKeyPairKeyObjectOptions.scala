package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAKeyPairKeyObjectOptions extends StObject {
  
  /**
    * Key size in bits
    */
  var modulusLength: Double
  
  /**
    * Public exponent
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
}
object RSAKeyPairKeyObjectOptions {
  
  inline def apply(modulusLength: Double): RSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairKeyObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSAKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    inline def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
  }
}
