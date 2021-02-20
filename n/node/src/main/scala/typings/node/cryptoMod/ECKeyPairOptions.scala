package typings.node.cryptoMod

import typings.node.anon.Format
import typings.node.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  /**
    * Name of the curve to use.
    */
  var namedCurve: String = js.native
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `1` = js.native
  
  var publicKeyEncoding: Format[PubF] = js.native
}
object ECKeyPairOptions {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    namedCurve: String,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `1`,
    publicKeyEncoding: Format[PubF]
  ): ECKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECKeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit class ECKeyPairOptionsMutableBuilder[Self <: ECKeyPairOptions[_, _], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self with (ECKeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    @scala.inline
    def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with `1`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyEncoding(value: Format[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
