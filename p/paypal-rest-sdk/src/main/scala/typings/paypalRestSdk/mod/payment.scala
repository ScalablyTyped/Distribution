package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payment {
  
  @JSImport("paypal-rest-sdk", "payment.create")
  @js.native
  def create(data: Payment_, config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.create")
  @js.native
  def create(data: Payment_, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.create")
  @js.native
  def create(data: Payment_, config: CallbackFunction[PaymentResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.create")
  @js.native
  def create(data: Payment_, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
  
  @JSImport("paypal-rest-sdk", "payment.execute")
  @js.native
  def execute(id: String, data: ExecuteRequest, config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.execute")
  @js.native
  def execute(id: String, data: ExecuteRequest, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.execute")
  @js.native
  def execute(id: String, data: ExecuteRequest, config: CallbackFunction[PaymentResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.execute")
  @js.native
  def execute(
    id: String,
    data: ExecuteRequest,
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  
  @JSImport("paypal-rest-sdk", "payment.get")
  @js.native
  def get(id: String, config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.get")
  @js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.get")
  @js.native
  def get(id: String, config: CallbackFunction[PaymentResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.get")
  @js.native
  def get(id: String, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
  
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: RequestOptions, config: js.UndefOr[scala.Nothing], cb: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: RequestOptions, config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: RequestOptions, config: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: RequestOptions, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(
    data: CallbackFunction[ListResponse],
    config: js.UndefOr[scala.Nothing],
    cb: CallbackFunction[ListResponse]
  ): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: CallbackFunction[ListResponse], config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: CallbackFunction[ListResponse], config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: CallbackFunction[ListResponse], config: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(
    data: CallbackFunction[ListResponse],
    config: CallbackFunction[ListResponse],
    cb: CallbackFunction[ListResponse]
  ): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: QueryParameters): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: QueryParameters, config: js.UndefOr[scala.Nothing], cb: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: QueryParameters, config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: QueryParameters, config: CallbackFunction[ListResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.list")
  @js.native
  def list(data: QueryParameters, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
  
  @JSImport("paypal-rest-sdk", "payment.update")
  @js.native
  def update(id: String, data: js.Array[UpdateRequest]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.update")
  @js.native
  def update(
    id: String,
    data: js.Array[UpdateRequest],
    config: js.UndefOr[scala.Nothing],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.update")
  @js.native
  def update(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.update")
  @js.native
  def update(
    id: String,
    data: js.Array[UpdateRequest],
    config: RequestOptions,
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.update")
  @js.native
  def update(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[PaymentResponse]): Unit = js.native
  @JSImport("paypal-rest-sdk", "payment.update")
  @js.native
  def update(
    id: String,
    data: js.Array[UpdateRequest],
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  
  @js.native
  trait AuthorizationResponse
    extends AuthorizationResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.native
  }
  object AuthorizationResponse {
    
    @scala.inline
    def apply(amount: Amount, httpStatusCode: Double, id: String, update_time: String, valid_until: String): AuthorizationResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationResponse]
    }
    
    @scala.inline
    implicit class AuthorizationResponseMutableBuilder[Self <: AuthorizationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
  
  @js.native
  trait CaptureResponse
    extends CaptureResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.native
  }
  object CaptureResponse {
    
    @scala.inline
    def apply(amount: Amount, httpStatusCode: Double, id: String): CaptureResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureResponse]
    }
    
    @scala.inline
    implicit class CaptureResponseMutableBuilder[Self <: CaptureResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
  
  @js.native
  trait ExecuteRequest extends StObject {
    
    var payer_id: String = js.native
  }
  object ExecuteRequest {
    
    @scala.inline
    def apply(payer_id: String): ExecuteRequest = {
      val __obj = js.Dynamic.literal(payer_id = payer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteRequest]
    }
    
    @scala.inline
    implicit class ExecuteRequestMutableBuilder[Self <: ExecuteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListResponse extends Response {
    
    @JSName("count")
    var count_ListResponse: Double = js.native
    
    var next_id: String = js.native
    
    var payments: js.Array[Payment_] = js.native
  }
  object ListResponse {
    
    @scala.inline
    def apply(count: Double, httpStatusCode: Double, next_id: String, payments: js.Array[Payment_]): ListResponse = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], next_id = next_id.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListResponse]
    }
    
    @scala.inline
    implicit class ListResponseMutableBuilder[Self <: ListResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_id(value: String): Self = StObject.set(x, "next_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayments(value: js.Array[Payment_]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentsVarargs(value: Payment_ *): Self = StObject.set(x, "payments", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RefundResponse
    extends RefundResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.native
  }
  object RefundResponse {
    
    @scala.inline
    def apply(amount: Amount, httpStatusCode: Double, id: String): RefundResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefundResponse]
    }
    
    @scala.inline
    implicit class RefundResponseMutableBuilder[Self <: RefundResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
  
  @js.native
  trait SaleResponse
    extends SaleResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.native
  }
  object SaleResponse {
    
    @scala.inline
    def apply(amount: Amount, httpStatusCode: Double, id: String): SaleResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaleResponse]
    }
    
    @scala.inline
    implicit class SaleResponseMutableBuilder[Self <: SaleResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
}
