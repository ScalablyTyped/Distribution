package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoEngineDecryptParams extends StObject {
  
  var encryptedContentInfo: EncryptedContentInfo
  
  var password: js.typedarray.ArrayBuffer
}
object CryptoEngineDecryptParams {
  
  inline def apply(encryptedContentInfo: EncryptedContentInfo, password: js.typedarray.ArrayBuffer): CryptoEngineDecryptParams = {
    val __obj = js.Dynamic.literal(encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoEngineDecryptParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoEngineDecryptParams] (val x: Self) extends AnyVal {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfo): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
