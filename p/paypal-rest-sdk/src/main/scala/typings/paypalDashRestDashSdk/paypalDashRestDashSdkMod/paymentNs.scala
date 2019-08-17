package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.paymentNs.ExecuteRequest
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.paymentNs.ListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment")
@js.native
object paymentNs extends js.Object {
  trait AuthorizationResponse
    extends AuthorizationResource
       with Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  
  trait CaptureResponse
    extends CaptureResource
       with Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  
  trait ExecuteRequest extends js.Object {
    var payer_id: String
  }
  
  trait ListResponse extends Response {
    @JSName("count")
    var count_ListResponse: Double
    var next_id: String
    var payments: js.Array[Payment]
  }
  
  trait RefundResponse
    extends RefundResource
       with Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  
  trait SaleResponse
    extends SaleResource
       with Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[String] = js.undefined
  }
  
  def create(data: Payment, config: RequestOptions): Unit = js.native
  def create(data: Payment, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def create(data: Payment, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def create(data: Payment, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def execute(id: String, data: ExecuteRequest, config: RequestOptions): Unit = js.native
  def execute(id: String, data: ExecuteRequest, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def execute(id: String, data: ExecuteRequest, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def execute(
    id: String,
    data: ExecuteRequest,
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  def get(id: String, config: RequestOptions): Unit = js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def get(id: String, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def get(id: String, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def list(data: RequestOptions): Unit = js.native
  def list(data: RequestOptions, config: RequestOptions): Unit = js.native
  def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: RequestOptions, config: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: RequestOptions, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: CallbackFunction[ListResponse], config: RequestOptions): Unit = js.native
  def list(data: CallbackFunction[ListResponse], config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: CallbackFunction[ListResponse], config: CallbackFunction[ListResponse]): Unit = js.native
  def list(
    data: CallbackFunction[ListResponse],
    config: CallbackFunction[ListResponse],
    cb: CallbackFunction[ListResponse]
  ): Unit = js.native
  def list(data: QueryParameters): Unit = js.native
  def list(data: QueryParameters, config: RequestOptions): Unit = js.native
  def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: QueryParameters, config: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: QueryParameters, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
  def update(id: String, data: js.Array[UpdateRequest]): Unit = js.native
  def update(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
  def update(
    id: String,
    data: js.Array[UpdateRequest],
    config: RequestOptions,
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  def update(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[PaymentResponse]): Unit = js.native
  def update(
    id: String,
    data: js.Array[UpdateRequest],
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
}

