package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseInvoiceSuccessCallbackResult extends StObject {
  
  /** 用户选中的发票列表 */
  var invoiceInfo: InvoiceInfo
}
object ChooseInvoiceSuccessCallbackResult {
  
  @scala.inline
  def apply(invoiceInfo: InvoiceInfo): ChooseInvoiceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(invoiceInfo = invoiceInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseInvoiceSuccessCallbackResultMutableBuilder[Self <: ChooseInvoiceSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoiceInfo(value: InvoiceInfo): Self = StObject.set(x, "invoiceInfo", value.asInstanceOf[js.Any])
  }
}
