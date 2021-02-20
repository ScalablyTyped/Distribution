package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureResource extends Resource {
  
  var invoice_number: js.UndefOr[String] = js.native
  
  var is_final_capture: js.UndefOr[Boolean] = js.native
  
  var transaction_fee: js.UndefOr[Currency] = js.native
}
object CaptureResource {
  
  @scala.inline
  def apply(amount: Amount, id: String): CaptureResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureResource]
  }
  
  @scala.inline
  implicit class CaptureResourceMutableBuilder[Self <: CaptureResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
    
    @scala.inline
    def setIs_final_capture(value: Boolean): Self = StObject.set(x, "is_final_capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_final_captureUndefined: Self = StObject.set(x, "is_final_capture", js.undefined)
    
    @scala.inline
    def setTransaction_fee(value: Currency): Self = StObject.set(x, "transaction_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_feeUndefined: Self = StObject.set(x, "transaction_fee", js.undefined)
  }
}
