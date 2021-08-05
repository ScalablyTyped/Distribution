package typings.node.cryptoMod

import typings.node.anon.FormatType
import typings.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X448KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`
  
  var publicKeyEncoding: FormatType[PubF]
}
object X448KeyPairOptions {
  
  inline def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & `0`,
    publicKeyEncoding: FormatType[PubF]
  ): X448KeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[X448KeyPairOptions[PubF, PrivF]]
  }
  
  extension [Self <: X448KeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](x: Self & (X448KeyPairOptions[PubF, PrivF])) {
    
    inline def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
