package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Giftwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amount extends js.Object {
  var currency: String = js.native
  var details: js.UndefOr[Giftwrap] = js.native
  var total: String = js.native
}

object Amount {
  @scala.inline
  def apply(currency: String, total: String): Amount = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  @scala.inline
  implicit class AmountOps[Self <: Amount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: Giftwrap): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
  
}

