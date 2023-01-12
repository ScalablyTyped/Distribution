package typings.node.cryptoMod

import typings.node.anon.FormatType
import typings.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAPSSKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  /**
    * Name of the message digest
    */
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the message digest used by MGF1
    */
  var mgf1HashAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Key size in bits
    */
  var modulusLength: Double
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`
  
  /**
    * Public exponent
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
  
  var publicKeyEncoding: FormatType[PubF]
  
  /**
    * Minimal salt length in bytes
    */
  var saltLength: js.UndefOr[String] = js.undefined
}
object RSAPSSKeyPairOptions {
  
  inline def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`,
    publicKeyEncoding: FormatType[PubF]
  ): RSAPSSKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPSSKeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSAPSSKeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self & (RSAPSSKeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMgf1HashAlgorithm(value: String): Self = StObject.set(x, "mgf1HashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMgf1HashAlgorithmUndefined: Self = StObject.set(x, "mgf1HashAlgorithm", js.undefined)
    
    inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    inline def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setSaltLength(value: String): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
  }
}
