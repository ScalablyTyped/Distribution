package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResponse extends Response {
  var invoices: js.Array[Invoice] = js.native
}

object ListResponse {
  @scala.inline
  def apply(httpStatusCode: Double, invoices: js.Array[Invoice]): ListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
  @scala.inline
  implicit class ListResponseOps[Self <: ListResponse] (val x: Self) extends AnyVal {
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
    def setInvoicesVarargs(value: Invoice*): Self = this.set("invoices", js.Array(value :_*))
    @scala.inline
    def setInvoices(value: js.Array[Invoice]): Self = this.set("invoices", value.asInstanceOf[js.Any])
  }
  
}

