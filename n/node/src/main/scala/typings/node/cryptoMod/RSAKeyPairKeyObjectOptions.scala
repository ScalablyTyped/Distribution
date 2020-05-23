package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAKeyPairKeyObjectOptions extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: Double
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[Double] = js.undefined
}

object RSAKeyPairKeyObjectOptions {
  @scala.inline
  def apply(modulusLength: Double, publicExponent: js.UndefOr[Double] = js.undefined): RSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any])
    if (!js.isUndefined(publicExponent)) __obj.updateDynamic("publicExponent")(publicExponent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairKeyObjectOptions]
  }
}

