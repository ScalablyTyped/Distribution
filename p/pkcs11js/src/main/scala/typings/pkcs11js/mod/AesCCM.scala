package typings.pkcs11js.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCCM
  extends StObject
     with IParams {
  
  var aad: js.UndefOr[Buffer] = js.undefined
  
  var dataLen: Double
  
  var macLen: Double
  
  var nonce: js.UndefOr[Buffer] = js.undefined
}
object AesCCM {
  
  inline def apply(dataLen: Double, macLen: Double, `type`: Double): AesCCM = {
    val __obj = js.Dynamic.literal(dataLen = dataLen.asInstanceOf[js.Any], macLen = macLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCCM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AesCCM] (val x: Self) extends AnyVal {
    
    inline def setAad(value: Buffer): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
    
    inline def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
    
    inline def setDataLen(value: Double): Self = StObject.set(x, "dataLen", value.asInstanceOf[js.Any])
    
    inline def setMacLen(value: Double): Self = StObject.set(x, "macLen", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: Buffer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
  }
}
