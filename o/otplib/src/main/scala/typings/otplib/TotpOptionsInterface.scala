package typings.otplib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TotpOptionsInterface extends HotpOptionsInterface {
  var epoch: js.UndefOr[js.Any] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var window: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object TotpOptionsInterface {
  @scala.inline
  def apply(
    algorithm: String = null,
    createHmacSecret: (/* secret */ String, /* options */ HmacOptions) => Buffer = null,
    crypto: js.Any = null,
    digits: Int | Double = null,
    encoding: String = null,
    epoch: js.Any = null,
    step: Int | Double = null,
    window: Double | js.Array[Double] = null
  ): TotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (createHmacSecret != null) __obj.updateDynamic("createHmacSecret")(js.Any.fromFunction2(createHmacSecret))
    if (crypto != null) __obj.updateDynamic("crypto")(crypto)
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (epoch != null) __obj.updateDynamic("epoch")(epoch)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpOptionsInterface]
  }
}

