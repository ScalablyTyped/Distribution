package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payouts {
  
  /**
    * Shows the latest status of a batch payout.
    * Includes the transaction status and other data for individual payout items.
    */
  @JSImport("@paypal/payouts-sdk", "payouts.PayoutsGetRequest")
  @js.native
  open class PayoutsGetRequest protected ()
    extends StObject
       with HttpRequest {
    def this(payoutBatchId: String) = this()
    
    def fields(fields: String): this.type = js.native
    
    /* CompleteClass */
    var headers: PaypalHeader = js.native
    
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
  @JSImport("@paypal/payouts-sdk", "payouts.PayoutsItemCancelRequest")
  @js.native
  open class PayoutsItemCancelRequest protected ()
    extends StObject
       with HttpRequest {
    def this(payoutItemId: String) = this()
    
    /* CompleteClass */
    var headers: PaypalHeader = js.native
  }
  
  /**
    * Shows details for a payout item, by ID.
    * A `payout_item_id` helps you identify denied payments.
    * If a payment is denied, you can use the `payout_item_id` to identify the payment even if it lacks a `transaction_id`.
    */
  @JSImport("@paypal/payouts-sdk", "payouts.PayoutsItemGetRequest")
  @js.native
  open class PayoutsItemGetRequest protected ()
    extends StObject
       with HttpRequest {
    def this(payoutItemId: String) = this()
    
    /* CompleteClass */
    var headers: PaypalHeader = js.native
  }
  
  /**
    * Creates a batch payout.
    * In the JSON request body, pass a `sender_batch_header` and an `items` array.
    * The `sender_batch_header` defines how to handle the payout.
    * The `items` array defines the payout items.
    * You can make payouts to one or more recipients.
    */
  @JSImport("@paypal/payouts-sdk", "payouts.PayoutsPostRequest")
  @js.native
  open class PayoutsPostRequest ()
    extends StObject
       with HttpRequest {
    
    /* CompleteClass */
    var headers: PaypalHeader = js.native
    
    def payPalPartnerAttributionId(payPalPartnerAttributionId: String): this.type = js.native
    
    def payPalRequestId(payPalRequestId: String): this.type = js.native
    
    def requestBody(createPayoutRequest: CreatePayoutRequestBody): this.type = js.native
  }
}
