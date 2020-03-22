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
    counter: Int | Double = null,
    digits: Int | Double = null,
    issuer: String = null,
    label: String = null,
    step: Int | Double = null
  ): KeyURIOptions = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyURIOptions]
  }
}

