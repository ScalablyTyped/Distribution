package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAKeyPairKeyObjectOptions extends js.Object {
  /**
    * Key size in bits
    */
  var modulusLength: scala.Double
  /**
    * @default 0x10001
    */
  var publicExponent: js.UndefOr[scala.Double] = js.undefined
}

object RSAKeyPairKeyObjectOptions {
  @scala.inline
  def apply(modulusLength: scala.Double, publicExponent: scala.Int | scala.Double = null): RSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("modulusLength")(modulusLength)
    if (publicExponent != null) __obj.updateDynamic("publicExponent")(publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAKeyPairKeyObjectOptions]
  }
}

