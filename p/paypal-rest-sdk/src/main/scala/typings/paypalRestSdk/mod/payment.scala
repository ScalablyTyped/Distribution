package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payment {
  
  @JSImport("paypal-rest-sdk", "payment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(data: Payment_, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(data: Payment_, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(data: Payment_, config: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(data: Payment_, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def execute(id: String, data: ExecuteRequest, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def execute(id: String, data: ExecuteRequest, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def execute(id: String, data: ExecuteRequest, config: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def execute(
    id: String,
    data: ExecuteRequest,
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list(data: RequestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(data: RequestOptions, config: Unit, cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: RequestOptions, config: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: RequestOptions, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: CallbackFunction[ListResponse]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(data: CallbackFunction[ListResponse], config: Unit, cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: CallbackFunction[ListResponse], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: CallbackFunction[ListResponse], config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: CallbackFunction[ListResponse], config: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(
    data: CallbackFunction[ListResponse],
    config: CallbackFunction[ListResponse],
    cb: CallbackFunction[ListResponse]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: QueryParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(data: QueryParameters, config: Unit, cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: QueryParameters, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: QueryParameters, config: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: QueryParameters, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update(id: String, data: js.Array[UpdateRequest]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(id: String, data: js.Array[UpdateRequest], config: Unit, cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(
    id: String,
    data: js.Array[UpdateRequest],
    config: RequestOptions,
    cb: CallbackFunction[PaymentResponse]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(
    id: String,
    data: js.Array[UpdateRequest],
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AuthorizationResponse
    extends StObject
       with AuthorizationResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  object AuthorizationResponse {
    
    inline def apply(amount: Amount, httpStatusCode: Double, id: String, update_time: String, valid_until: String): AuthorizationResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationResponse]
    }
    
    extension [Self <: AuthorizationResponse](x: Self) {
      
      inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
  
  trait CaptureResponse
    extends StObject
       with CaptureResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  object CaptureResponse {
    
    inline def apply(amount: Amount, httpStatusCode: Double, id: String): CaptureResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureResponse]
    }
    
    extension [Self <: CaptureResponse](x: Self) {
      
      inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
  
  trait ExecuteRequest extends StObject {
    
    var payer_id: String
  }
  object ExecuteRequest {
    
    inline def apply(payer_id: String): ExecuteRequest = {
      val __obj = js.Dynamic.literal(payer_id = payer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteRequest]
    }
    
    extension [Self <: ExecuteRequest](x: Self) {
      
      inline def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListResponse
    extends StObject
       with Response {
    
    @JSName("count")
    var count_ListResponse: Double
    
    var next_id: String
    
    var payments: js.Array[Payment_]
  }
  object ListResponse {
    
    inline def apply(count: Double, httpStatusCode: Double, next_id: String, payments: js.Array[Payment_]): ListResponse = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], next_id = next_id.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListResponse]
    }
    
    extension [Self <: ListResponse](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setNext_id(value: String): Self = StObject.set(x, "next_id", value.asInstanceOf[js.Any])
      
      inline def setPayments(value: js.Array[Payment_]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
      
      inline def setPaymentsVarargs(value: Payment_ *): Self = StObject.set(x, "payments", js.Array(value :_*))
    }
  }
  
  trait RefundResponse
    extends StObject
       with RefundResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  object RefundResponse {
    
    inline def apply(amount: Amount, httpStatusCode: Double, id: String): RefundResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefundResponse]
    }
    
    extension [Self <: RefundResponse](x: Self) {
      
      inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
  
  trait SaleResponse
    extends StObject
       with SaleResource
       with Response {
    
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  object SaleResponse {
    
    inline def apply(amount: Amount, httpStatusCode: Double, id: String): SaleResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaleResponse]
    }
    
    extension [Self <: SaleResponse](x: Self) {
      
      inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    }
  }
}
