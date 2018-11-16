package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment")
@js.native
object paymentNs extends js.Object {
  
  trait AuthorizationResponse
    extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource
       with paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait CaptureResponse
    extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource
       with paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ExecuteRequest extends js.Object {
    var payer_id: java.lang.String
  }
  
  
  trait ListResponse
    extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
    @JSName("count")
    var count_ListResponse: scala.Double
    var next_id: java.lang.String
    var payments: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Payment]
  }
  
  
  trait RefundResponse
    extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.RefundResource
       with paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait SaleResponse
    extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.SaleResource
       with paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
    /* InferMemberOverrides */
    override val create_time: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def create(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Payment,
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def create(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Payment,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def create(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Payment,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def create(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Payment,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def execute(id: java.lang.String, data: ExecuteRequest, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def execute(
    id: java.lang.String,
    data: ExecuteRequest,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def execute(
    id: java.lang.String,
    data: ExecuteRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def execute(
    id: java.lang.String,
    data: ExecuteRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def get(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def list(data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def list(data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def list(
    data: nodeLib.httpMod.RequestOptions,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest]
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.UpdateRequest],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.PaymentResponse]
  ): scala.Unit = js.native
}

