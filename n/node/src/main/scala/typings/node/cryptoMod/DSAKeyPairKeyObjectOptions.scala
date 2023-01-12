package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSAKeyPairKeyObjectOptions extends StObject {
  
  /**
    * Size of q in bits
    */
  var divisorLength: Double
  
  /**
    * Key size in bits
    */
  var modulusLength: Double
}
object DSAKeyPairKeyObjectOptions {
  
  inline def apply(divisorLength: Double, modulusLength: Double): DSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSAKeyPairKeyObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DSAKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setDivisorLength(value: Double): Self = StObject.set(x, "divisorLength", value.asInstanceOf[js.Any])
    
    inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
  }
}
