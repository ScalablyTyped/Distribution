package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capture {
  
  @JSImport("paypal-rest-sdk", "capture")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: CallbackFunction[CaptureResource], cb: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def refund(id: String, data: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RequestOptions, config: Unit, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RequestOptions, config: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: Unit,
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: CallbackFunction[RefundResource], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: RequestOptions,
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: CallbackFunction[RefundResource], config: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RefundRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RefundRequest, config: Unit, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RefundRequest, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RefundRequest, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(id: String, data: RefundRequest, config: CallbackFunction[RefundResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def refund(
    id: String,
    data: RefundRequest,
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refund")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
