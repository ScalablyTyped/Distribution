package typings.node.cryptoMod

import typings.node.anon.FormatType
import typings.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  /**
    * Size of q in bits
    */
  var divisorLength: Double
  
  /**
    * Key size in bits
    */
  var modulusLength: Double
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`
  
  var publicKeyEncoding: FormatType[PubF]
}
object DSAKeyPairOptions {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    divisorLength: Double,
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`,
    publicKeyEncoding: FormatType[PubF]
  ): DSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSAKeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit class DSAKeyPairOptionsMutableBuilder[Self <: DSAKeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self & (DSAKeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    @scala.inline
    def setDivisorLength(value: Double): Self = StObject.set(x, "divisorLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
