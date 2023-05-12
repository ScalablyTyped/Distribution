package typings.pkijs.mod

import typings.std.Crypto
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopedDataDecryptKeyParams
  extends StObject
     with EnvelopedDataDecryptBaseParams
     with EnvelopedDataDecryptParams {
  
  /**
    * Crypto provider assigned to `recipientPrivateKey`. If the filed is empty uses default crypto provider.
    */
  var crypto: js.UndefOr[Crypto] = js.undefined
  
  var recipientPrivateKey: CryptoKey
}
object EnvelopedDataDecryptKeyParams {
  
  inline def apply(recipientPrivateKey: CryptoKey): EnvelopedDataDecryptKeyParams = {
    val __obj = js.Dynamic.literal(recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopedDataDecryptKeyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopedDataDecryptKeyParams] (val x: Self) extends AnyVal {
    
    inline def setCrypto(value: Crypto): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    inline def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
    
    inline def setRecipientPrivateKey(value: CryptoKey): Self = StObject.set(x, "recipientPrivateKey", value.asInstanceOf[js.Any])
  }
}
