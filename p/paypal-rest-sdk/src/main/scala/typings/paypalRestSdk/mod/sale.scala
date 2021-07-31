package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sale {
  
  @JSImport("paypal-rest-sdk", "sale")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def get(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def refund(id: String, data: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RequestOptions, config: Unit, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RequestOptions, config: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: Unit,
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: CallbackFunction[RefundResource], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: RequestOptions,
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: CallbackFunction[RefundResource], config: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RefundRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RefundRequest, config: Unit, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RefundRequest, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RefundRequest, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(id: String, data: RefundRequest, config: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def refund(
    id: String,
    data: RefundRequest,
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
