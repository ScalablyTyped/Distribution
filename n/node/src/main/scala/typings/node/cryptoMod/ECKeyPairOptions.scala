package typings.node.cryptoMod

import typings.node.anon.FormatType
import typings.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  /**
    * Name of the curve to use.
    */
  var namedCurve: String
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`
  
  var publicKeyEncoding: FormatType[PubF]
}
object ECKeyPairOptions {
  
  inline def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    namedCurve: String,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`,
    publicKeyEncoding: FormatType[PubF]
  ): ECKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECKeyPairOptions[PubF, PrivF]]
  }
  
  extension [Self <: ECKeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](x: Self & (ECKeyPairOptions[PubF, PrivF])) {
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
