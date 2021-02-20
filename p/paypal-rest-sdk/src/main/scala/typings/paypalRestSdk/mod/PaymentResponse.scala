package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Paymentmethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentResponse
  extends Payment_
     with Response {
  
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.native
}
object PaymentResponse {
  
  @scala.inline
  def apply(httpStatusCode: Double, intent: String, payer: Paymentmethod, transactions: js.Array[Transaction]): PaymentResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResponse]
  }
  
  @scala.inline
  implicit class PaymentResponseMutableBuilder[Self <: PaymentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
  }
}
