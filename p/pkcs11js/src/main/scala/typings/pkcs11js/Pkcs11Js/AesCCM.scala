package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesCCM extends IParams {
  
  var aad: js.UndefOr[Buffer] = js.native
  
  var dataLen: Double = js.native
  
  var macLen: Double = js.native
  
  var nonce: js.UndefOr[Buffer] = js.native
}
object AesCCM {
  
  @scala.inline
  def apply(dataLen: Double, macLen: Double, `type`: Double): AesCCM = {
    val __obj = js.Dynamic.literal(dataLen = dataLen.asInstanceOf[js.Any], macLen = macLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCCM]
  }
  
  @scala.inline
  implicit class AesCCMMutableBuilder[Self <: AesCCM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAad(value: Buffer): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
    
    @scala.inline
    def setDataLen(value: Double): Self = StObject.set(x, "dataLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacLen(value: Double): Self = StObject.set(x, "macLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: Buffer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
  }
}
