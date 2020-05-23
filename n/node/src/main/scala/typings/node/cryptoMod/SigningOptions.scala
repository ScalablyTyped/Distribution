package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningOptions extends js.Object {
  /**
    * @See crypto.constants.RSA_PKCS1_PADDING
    */
  var padding: js.UndefOr[Double] = js.undefined
  var saltLength: js.UndefOr[Double] = js.undefined
}

object SigningOptions {
  @scala.inline
  def apply(padding: js.UndefOr[Double] = js.undefined, saltLength: js.UndefOr[Double] = js.undefined): SigningOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saltLength)) __obj.updateDynamic("saltLength")(saltLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningOptions]
  }
}

