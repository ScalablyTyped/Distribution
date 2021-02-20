package typings.node.cryptoMod

import typings.node.anon.FormatType
import typings.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X448KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0` = js.native
  
  var publicKeyEncoding: FormatType[PubF] = js.native
}
object X448KeyPairOptions {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0`,
    publicKeyEncoding: FormatType[PubF]
  ): X448KeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[X448KeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit class X448KeyPairOptionsMutableBuilder[Self <: X448KeyPairOptions[_, _], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self with (X448KeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
