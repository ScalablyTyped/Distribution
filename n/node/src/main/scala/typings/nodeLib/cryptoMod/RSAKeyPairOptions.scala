package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAKeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: scala.Double
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_Pkcs1
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[scala.Double] = js.undefined
  var publicKeyEncoding: nodeLib.Anon_Format[PubF]
}

object RSAKeyPairOptions {
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    modulusLength: scala.Double,
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with nodeLib.Anon_Pkcs1,
    publicKeyEncoding: nodeLib.Anon_Format[PubF],
    publicExponent: scala.Int | scala.Double = null
  ): RSAKeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength, privateKeyEncoding = privateKeyEncoding, publicKeyEncoding = publicKeyEncoding)
    if (publicExponent != null) __obj.updateDynamic("publicExponent")(publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairOptions[PubF, PrivF]]
  }
}

