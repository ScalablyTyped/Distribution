package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoice extends js.Object {
  var currency: String = js.native
  var description: String = js.native
  var start_parameter: String = js.native
  var title: String = js.native
  var total_amount: Double = js.native
}

object Invoice {
  @scala.inline
  def apply(
    currency: String,
    description: String,
    start_parameter: String,
    title: String,
    total_amount: Double
  ): Invoice = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], start_parameter = start_parameter.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoice]
  }
  @scala.inline
  implicit class InvoiceOps[Self <: Invoice] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_parameter(value: String): Self = this.set("start_parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_amount(value: Double): Self = this.set("total_amount", value.asInstanceOf[js.Any])
  }
  
}

