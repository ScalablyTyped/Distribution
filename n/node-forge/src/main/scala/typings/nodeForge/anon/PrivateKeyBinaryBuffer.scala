package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.BinaryBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKeyBinaryBuffer extends StObject {
  
  var privateKey: BinaryBuffer
}
object PrivateKeyBinaryBuffer {
  
  @scala.inline
  def apply(privateKey: BinaryBuffer): PrivateKeyBinaryBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyBinaryBuffer]
  }
  
  @scala.inline
  implicit class PrivateKeyBinaryBufferMutableBuilder[Self <: PrivateKeyBinaryBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: BinaryBuffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
