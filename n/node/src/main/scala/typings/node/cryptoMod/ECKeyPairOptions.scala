package typings.node.cryptoMod

import typings.node.Anon1
import typings.node.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: String
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon1
  var publicKeyEncoding: AnonFormat[PubF]
}

object ECKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    namedCurve: String,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon1,
    publicKeyEncoding: AnonFormat[PubF]
  ): ECKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ECKeyPairOptions[PubF, PrivF]]
  }
}

