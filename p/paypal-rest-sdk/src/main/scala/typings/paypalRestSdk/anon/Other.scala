package typings.paypalRestSdk.anon

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other extends js.Object {
  var other: Currency
  var paypal: Currency
}

object Other {
  @scala.inline
  def apply(other: Currency, paypal: Currency): Other = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
}

