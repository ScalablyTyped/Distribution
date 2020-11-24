package typings.paypalPayoutsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/payouts-sdk", "payouts")
@js.native
object payouts extends js.Object {
  
  /**
    * Shows the latest status of a batch payout.
    * Includes the transaction status and other data for individual payout items.
    */
  @js.native
  class PayoutsGetRequest protected () extends HttpRequest {
    def this(payoutBatchId: String) = this()
    
    def fields(fields: String): this.type = js.native
    
    def page(page: Double): this.type = js.native
    
    def pageSize(pageSize: Double): this.type = js.native
    
    def totalRequired(totalRequired: Boolean): this.type = js.native
  }
  
  /**
    * Cancels an unclaimed payout item, by ID.
    * If no one claims the unclaimed item within 30 days, the API automatically returns the funds to the sender.
    * Use this call to cancel the unclaimed item before the automatic 30-day refund.
    * You can cancel payout items with a `transaction_status` of `UNCLAIMED`.
    */
  @js.native
  class PayoutsItemCancelRequest protected () extends HttpRequest {
    def this(payoutItemId: String) = this()
  }
  
  /**
    * Shows details for a payout item, by ID.
    * A `payout_item_id` helps you identify denied payments.
    * If a payment is denied, you can use the `payout_item_id` to identify the payment even if it lacks a `transaction_id`.
    */
  @js.native
  class PayoutsItemGetRequest protected () extends HttpRequest {
    def this(payoutItemId: String) = this()
  }
  
  /**
    * Creates a batch payout.
    * In the JSON request body, pass a `sender_batch_header` and an `items` array.
    * The `sender_batch_header` defines how to handle the payout.
    * The `items` array defines the payout items.
    * You can make payouts to one or more recipients.
    */
  @js.native
  class PayoutsPostRequest () extends HttpRequest {
    
    def payPalPartnerAttributionId(payPalPartnerAttributionId: String): this.type = js.native
    
    def payPalRequestId(payPalRequestId: String): this.type = js.native
    
    def requestBody(createPayoutRequest: CreatePayoutRequestBody): this.type = js.native
  }
}
