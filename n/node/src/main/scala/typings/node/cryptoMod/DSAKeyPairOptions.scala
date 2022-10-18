package typings.node.cryptoMod

import typings.node.anon.Format
import typings.node.anon.Type
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
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type
  
  var publicKeyEncoding: Format[PubF]
}
object DSAKeyPairOptions {
  
  inline def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    divisorLength: Double,
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type,
    publicKeyEncoding: Format[PubF]
  ): DSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSAKeyPairOptions[PubF, PrivF]]
  }
  
  extension [Self <: DSAKeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](x: Self & (DSAKeyPairOptions[PubF, PrivF])) {
    
    inline def setDivisorLength(value: Double): Self = StObject.set(x, "divisorLength", value.asInstanceOf[js.Any])
    
    inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & Type): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyEncoding(value: Format[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
