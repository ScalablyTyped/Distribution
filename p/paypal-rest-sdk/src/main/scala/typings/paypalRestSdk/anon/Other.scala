package typings.paypalRestSdk.anon

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Other extends js.Object {
  var other: Currency = js.native
  var paypal: Currency = js.native
}

object Other {
  @scala.inline
  def apply(other: Currency, paypal: Currency): Other = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  @scala.inline
  implicit class OtherOps[Self <: Other] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other_ <: js.Any](other: Other_): Self with Other_ = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other_]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOther(value: Currency): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaypal(value: Currency): Self = this.set("paypal", value.asInstanceOf[js.Any])
  }
  
}

