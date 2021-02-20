package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSAKeyPairKeyObjectOptions extends StObject {
  
  /**
    * Size of q in bits
    */
  var divisorLength: Double = js.native
  
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
}
object DSAKeyPairKeyObjectOptions {
  
  @scala.inline
  def apply(divisorLength: Double, modulusLength: Double): DSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSAKeyPairKeyObjectOptions]
  }
  
  @scala.inline
  implicit class DSAKeyPairKeyObjectOptionsMutableBuilder[Self <: DSAKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDivisorLength(value: Double): Self = StObject.set(x, "divisorLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
  }
}
