package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.CANCELED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.DENIED
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.PROCESSING
import typings.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutHeader extends StObject {
  
  var batch_status: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS = js.native
  
  var errors: js.UndefOr[js.Any] = js.native
  
  var payout_batch_id: String = js.native
  
  var sender_batch_header: PayoutSenderBatchHeader = js.native
  
  var time_created: js.UndefOr[String] = js.native
}
object PayoutHeader {
  
  @scala.inline
  def apply(
    batch_status: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS,
    payout_batch_id: String,
    sender_batch_header: PayoutSenderBatchHeader
  ): PayoutHeader = {
    val __obj = js.Dynamic.literal(batch_status = batch_status.asInstanceOf[js.Any], payout_batch_id = payout_batch_id.asInstanceOf[js.Any], sender_batch_header = sender_batch_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutHeader]
  }
  
  @scala.inline
  implicit class PayoutHeaderMutableBuilder[Self <: PayoutHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch_status(value: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS): Self = StObject.set(x, "batch_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setPayout_batch_id(value: String): Self = StObject.set(x, "payout_batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_batch_header(value: PayoutSenderBatchHeader): Self = StObject.set(x, "sender_batch_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_created(value: String): Self = StObject.set(x, "time_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_createdUndefined: Self = StObject.set(x, "time_created", js.undefined)
  }
}
