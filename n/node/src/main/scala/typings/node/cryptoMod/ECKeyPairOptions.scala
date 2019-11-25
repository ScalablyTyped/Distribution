package typings.node.cryptoMod

import typings.node.Anon_Format
import typings.node.Anon_Pkcs8Sec1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: java.lang.String
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon_Pkcs8Sec1
  var publicKeyEncoding: Anon_Format[PubF]
}

object ECKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    namedCurve: java.lang.String,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon_Pkcs8Sec1,
    publicKeyEncoding: Anon_Format[PubF]
  ): ECKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ECKeyPairOptions[PubF, PrivF]]
  }
}

