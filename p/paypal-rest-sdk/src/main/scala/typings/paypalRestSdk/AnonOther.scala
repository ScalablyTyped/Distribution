package typings.paypalRestSdk

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOther extends js.Object {
  var other: Currency
  var paypal: Currency
}

object AnonOther {
  @scala.inline
  def apply(other: Currency, paypal: Currency): AnonOther = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOther]
  }
}

