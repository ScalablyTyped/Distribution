package typings.otplibPresetV11

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotpOptionsInterface extends HmacOptions {
  var createHmacSecret: js.UndefOr[typings.otplibPresetV11.createHmacSecret] = js.undefined
  var crypto: js.UndefOr[js.Any] = js.undefined
  var digits: js.UndefOr[Double] = js.undefined
}

object HotpOptionsInterface {
  @scala.inline
  def apply(
    algorithm: String = null,
    createHmacSecret: (/* secret */ String, /* options */ HmacOptions) => Buffer = null,
    crypto: js.Any = null,
    digits: js.UndefOr[Double] = js.undefined,
    encoding: String = null
  ): HotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (createHmacSecret != null) __obj.updateDynamic("createHmacSecret")(js.Any.fromFunction2(createHmacSecret))
    if (crypto != null) __obj.updateDynamic("crypto")(crypto.asInstanceOf[js.Any])
    if (!js.isUndefined(digits)) __obj.updateDynamic("digits")(digits.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotpOptionsInterface]
  }
}

