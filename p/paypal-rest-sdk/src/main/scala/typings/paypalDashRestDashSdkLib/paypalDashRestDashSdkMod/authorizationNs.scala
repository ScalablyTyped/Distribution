package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "authorization")
@js.native
object authorizationNs extends js.Object {
  
  trait CaptureRequest extends js.Object {
    var amount: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Amount] = js.undefined
    var invoice_number: js.UndefOr[java.lang.String] = js.undefined
    var is_final_capture: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  def capture(id: java.lang.String, data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def capture(id: java.lang.String, data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource],
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource],
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(id: java.lang.String, data: CaptureRequest): scala.Unit = js.native
  def capture(id: java.lang.String, data: CaptureRequest, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: CaptureRequest,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: CaptureRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def capture(
    id: java.lang.String,
    data: CaptureRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CaptureResource]
  ): scala.Unit = js.native
  def get(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(id: java.lang.String, data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def reauthorize(id: java.lang.String, data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(id: java.lang.String, data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Amount): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Amount,
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Amount,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Amount,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Amount,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
  def reauthorize(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.AuthorizationResource]
  ): scala.Unit = js.native
}

