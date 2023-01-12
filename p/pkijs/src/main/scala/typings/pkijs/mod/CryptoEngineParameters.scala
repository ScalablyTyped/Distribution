package typings.pkijs.mod

import typings.std.Crypto
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoEngineParameters extends StObject {
  
  var crypto: Crypto
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var subtle: js.UndefOr[SubtleCrypto] = js.undefined
}
object CryptoEngineParameters {
  
  inline def apply(crypto: Crypto): CryptoEngineParameters = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoEngineParameters] (val x: Self) extends AnyVal {
    
    inline def setCrypto(value: Crypto): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubtle(value: SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def setSubtleUndefined: Self = StObject.set(x, "subtle", js.undefined)
  }
}
