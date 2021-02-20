package typings.node.cryptoMod

import typings.node.anon.Format
import typings.node.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  /**
    * Key size in bits
    */
  var modulusLength: Double = js.native
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Type = js.native
  
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.native
  
  var publicKeyEncoding: Format[PubF] = js.native
}
object RSAKeyPairOptions {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Type,
    publicKeyEncoding: Format[PubF]
  ): RSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit class RSAKeyPairOptionsMutableBuilder[Self <: RSAKeyPairOptions[_, _], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self with (RSAKeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with Type): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    @scala.inline
    def setPublicKeyEncoding(value: Format[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
