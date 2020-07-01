package typings.node.cryptoMod

import typings.node.anon.Format
import typings.node.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: Double
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Type
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
  var publicKeyEncoding: Format[PubF]
}

object RSAKeyPairOptions {
  @scala.inline
  def apply[/* <: typings.node.cryptoMod.KeyFormat */ PubF, /* <: typings.node.cryptoMod.KeyFormat */ PrivF](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Type,
    publicKeyEncoding: Format[PubF],
    publicExponent: js.UndefOr[Double] = js.undefined
  ): RSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(publicExponent)) __obj.updateDynamic("publicExponent")(publicExponent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairOptions[PubF, PrivF]]
  }
}

