package typings.node.cryptoMod

import typings.node.anon.FormatType
import typings.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ED25519KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`
  
  var publicKeyEncoding: FormatType[PubF]
}
object ED25519KeyPairOptions {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`,
    publicKeyEncoding: FormatType[PubF]
  ): ED25519KeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ED25519KeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit class ED25519KeyPairOptionsMutableBuilder[Self <: ED25519KeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self & (ED25519KeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
