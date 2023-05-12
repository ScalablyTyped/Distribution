package typings.pkijs.mod

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopedDataDecryptBufferParams
  extends StObject
     with EnvelopedDataDecryptBaseParams
     with EnvelopedDataDecryptParams {
  
  var recipientPrivateKey: js.UndefOr[BufferSource] = js.undefined
}
object EnvelopedDataDecryptBufferParams {
  
  inline def apply(): EnvelopedDataDecryptBufferParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopedDataDecryptBufferParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopedDataDecryptBufferParams] (val x: Self) extends AnyVal {
    
    inline def setRecipientPrivateKey(value: BufferSource): Self = StObject.set(x, "recipientPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setRecipientPrivateKeyUndefined: Self = StObject.set(x, "recipientPrivateKey", js.undefined)
  }
}
