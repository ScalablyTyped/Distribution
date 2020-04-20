package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseInvoiceSuccessCallbackResult extends js.Object {
  /** 用户选中的发票列表 */
  var invoiceInfo: InvoiceInfo
}

object ChooseInvoiceSuccessCallbackResult {
  @scala.inline
  def apply(invoiceInfo: InvoiceInfo): ChooseInvoiceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(invoiceInfo = invoiceInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceSuccessCallbackResult]
  }
}

