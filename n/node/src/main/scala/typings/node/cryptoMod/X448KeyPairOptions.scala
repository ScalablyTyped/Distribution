package typings.node.cryptoMod

import typings.node.anon.Format
import typings.node.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X448KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type
  
  var publicKeyEncoding: Format[PubF]
}
object X448KeyPairOptions {
  
  inline def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type, publicKeyEncoding: Format[PubF]): X448KeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[X448KeyPairOptions[PubF, PrivF]]
  }
  
  extension [Self <: X448KeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](x: Self & (X448KeyPairOptions[PubF, PrivF])) {
    
    inline def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & Type): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyEncoding(value: Format[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
