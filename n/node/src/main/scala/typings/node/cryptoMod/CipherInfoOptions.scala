package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherInfoOptions extends StObject {
  
  /**
    * A test IV length.
    */
  var ivLength: js.UndefOr[Double] = js.undefined
  
  /**
    * A test key length.
    */
  var keyLength: js.UndefOr[Double] = js.undefined
}
object CipherInfoOptions {
  
  inline def apply(): CipherInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherInfoOptions]
  }
  
  extension [Self <: CipherInfoOptions](x: Self) {
    
    inline def setIvLength(value: Double): Self = StObject.set(x, "ivLength", value.asInstanceOf[js.Any])
    
    inline def setIvLengthUndefined: Self = StObject.set(x, "ivLength", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
  }
}
