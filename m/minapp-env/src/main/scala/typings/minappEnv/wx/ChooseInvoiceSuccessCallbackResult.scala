package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseInvoiceSuccessCallbackResult extends js.Object {
  /** 用户选中的发票列表 */
  var invoiceInfo: InvoiceInfo = js.native
}

object ChooseInvoiceSuccessCallbackResult {
  @scala.inline
  def apply(invoiceInfo: InvoiceInfo): ChooseInvoiceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(invoiceInfo = invoiceInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceSuccessCallbackResult]
  }
  @scala.inline
  implicit class ChooseInvoiceSuccessCallbackResultOps[Self <: ChooseInvoiceSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setInvoiceInfo(value: InvoiceInfo): Self = this.set("invoiceInfo", value.asInstanceOf[js.Any])
  }
  
}

