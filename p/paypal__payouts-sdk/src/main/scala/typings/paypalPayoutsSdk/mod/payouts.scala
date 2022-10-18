package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payouts {
  
  /**
    * Shows the latest status of a batch payout.
    * Includes the transaction status and other data for individual payout items.
    */
  trait PayoutsGetRequest
    extends StObject
       with HttpRequest {
    
    def fields(fields: String): this.type
    
    def page(page: Double): this.type
    
    def pageSize(pageSize: Double): this.type
    
    def totalRequired(totalRequired: Boolean): this.type
  }
  object PayoutsGetRequest {
    
    inline def apply(
      fields: String => PayoutsGetRequest,
      headers: PaypalHeader,
      page: Double => PayoutsGetRequest,
      pageSize: Double => PayoutsGetRequest,
      totalRequired: Boolean => PayoutsGetRequest
    ): PayoutsGetRequest = {
      val __obj = js.Dynamic.literal(fields = js.Any.fromFunction1(fields), headers = headers.asInstanceOf[js.Any], page = js.Any.fromFunction1(page), pageSize = js.Any.fromFunction1(pageSize), totalRequired = js.Any.fromFunction1(totalRequired))
      __obj.asInstanceOf[PayoutsGetRequest]
    }
    
    extension [Self <: PayoutsGetRequest](x: Self) {
      
      inline def setFields(value: String => PayoutsGetRequest): Self = StObject.set(x, "fields", js.Any.fromFunction1(value))
      
      inline def setPage(value: Double => PayoutsGetRequest): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
      
      inline def setPageSize(value: Double => PayoutsGetRequest): Self = StObject.set(x, "pageSize", js.Any.fromFunction1(value))
      
      inline def setTotalRequired(value: Boolean => PayoutsGetRequest): Self = StObject.set(x, "totalRequired", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Cancels an unclaimed payout item, by ID.
    * If no one claims the unclaimed item within 30 days, the API automatically returns the funds to the sender.
    * Use this call to cancel the unclaimed item before the automatic 30-day refund.
    * You can cancel payout items with a `transaction_status` of `UNCLAIMED`.
    */
  trait PayoutsItemCancelRequest
    extends StObject
       with HttpRequest
  object PayoutsItemCancelRequest {
    
    inline def apply(headers: PaypalHeader): PayoutsItemCancelRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayoutsItemCancelRequest]
    }
  }
  
  /**
    * Shows details for a payout item, by ID.
    * A `payout_item_id` helps you identify denied payments.
    * If a payment is denied, you can use the `payout_item_id` to identify the payment even if it lacks a `transaction_id`.
    */
  trait PayoutsItemGetRequest
    extends StObject
       with HttpRequest
  object PayoutsItemGetRequest {
    
    inline def apply(headers: PaypalHeader): PayoutsItemGetRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayoutsItemGetRequest]
    }
  }
  
  /**
    * Creates a batch payout.
    * In the JSON request body, pass a `sender_batch_header` and an `items` array.
    * The `sender_batch_header` defines how to handle the payout.
    * The `items` array defines the payout items.
    * You can make payouts to one or more recipients.
    */
  trait PayoutsPostRequest
    extends StObject
       with HttpRequest {
    
    def payPalPartnerAttributionId(payPalPartnerAttributionId: String): this.type
    
    def payPalRequestId(payPalRequestId: String): this.type
    
    def requestBody(createPayoutRequest: CreatePayoutRequestBody): this.type
  }
  object PayoutsPostRequest {
    
    inline def apply(
      headers: PaypalHeader,
      payPalPartnerAttributionId: String => PayoutsPostRequest,
      payPalRequestId: String => PayoutsPostRequest,
      requestBody: CreatePayoutRequestBody => PayoutsPostRequest
    ): PayoutsPostRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payPalPartnerAttributionId = js.Any.fromFunction1(payPalPartnerAttributionId), payPalRequestId = js.Any.fromFunction1(payPalRequestId), requestBody = js.Any.fromFunction1(requestBody))
      __obj.asInstanceOf[PayoutsPostRequest]
    }
    
    extension [Self <: PayoutsPostRequest](x: Self) {
      
      inline def setPayPalPartnerAttributionId(value: String => PayoutsPostRequest): Self = StObject.set(x, "payPalPartnerAttributionId", js.Any.fromFunction1(value))
      
      inline def setPayPalRequestId(value: String => PayoutsPostRequest): Self = StObject.set(x, "payPalRequestId", js.Any.fromFunction1(value))
      
      inline def setRequestBody(value: CreatePayoutRequestBody => PayoutsPostRequest): Self = StObject.set(x, "requestBody", js.Any.fromFunction1(value))
    }
  }
}
