package typings.paypalDashRestDashSdk

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Other extends js.Object {
  var other: Currency
  var paypal: Currency
}

object Anon_Other {
  @scala.inline
  def apply(other: Currency, paypal: Currency): Anon_Other = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Other]
  }
}

