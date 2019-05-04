package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningOptions extends js.Object {
  /**
    * @See crypto.constants.RSA_PKCS1_PADDING
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  var saltLength: js.UndefOr[scala.Double] = js.undefined
}

object SigningOptions {
  @scala.inline
  def apply(padding: scala.Int | scala.Double = null, saltLength: scala.Int | scala.Double = null): SigningOptions = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningOptions]
  }
}

