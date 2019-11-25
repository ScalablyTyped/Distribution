package typings.node.cryptoMod

import typings.node.Anon_Format
import typings.node.Anon_Pkcs1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: Double
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon_Pkcs1
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
  var publicKeyEncoding: Anon_Format[PubF]
}

object RSAKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    modulusLength: Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with Anon_Pkcs1,
    publicKeyEncoding: Anon_Format[PubF],
    publicExponent: Int | Double = null
  ): RSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    if (publicExponent != null) __obj.updateDynamic("publicExponent")(publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairOptions[PubF, PrivF]]
  }
}

