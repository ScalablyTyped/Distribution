package typings.otplibCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyURIOptions extends js.Object {
  var accountName: String
  var algorithm: js.UndefOr[HashAlgorithms] = js.undefined
  var counter: js.UndefOr[Double] = js.undefined
  var digits: js.UndefOr[Double] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var secret: SecretKey
  var step: js.UndefOr[Double] = js.undefined
  var `type`: Strategy
}

object KeyURIOptions {
  @scala.inline
  def apply(
    accountName: String,
    secret: SecretKey,
    `type`: Strategy,
    algorithm: HashAlgorithms = null,
    counter: js.UndefOr[Double] = js.undefined,
    digits: js.UndefOr[Double] = js.undefined,
    issuer: String = null,
    label: String = null,
    step: js.UndefOr[Double] = js.undefined
  ): KeyURIOptions = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(digits)) __obj.updateDynamic("digits")(digits.get.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyURIOptions]
  }
}

