package typings.node.cryptoMod

import typings.node.anon.Format
import typings.node.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ED448KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type
  
  var publicKeyEncoding: Format[PubF]
}
object ED448KeyPairOptions {
  
  inline def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] & Type, publicKeyEncoding: Format[PubF]): ED448KeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ED448KeyPairOptions[PubF, PrivF]]
  }
  
  extension [Self <: ED448KeyPairOptions[?, ?], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](x: Self & (ED448KeyPairOptions[PubF, PrivF])) {
    
    inline def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] & Type): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyEncoding(value: Format[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
