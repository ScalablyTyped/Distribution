package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorization {
  
  @JSImport("paypal-rest-sdk", "authorization")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def capture(id: String, data: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: RequestOptions, config: Unit, cb: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: RequestOptions, config: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(
    id: String,
    data: CallbackFunction[CaptureResource],
    config: Unit,
    cb: CallbackFunction[CaptureResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CallbackFunction[CaptureResource], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(
    id: String,
    data: CallbackFunction[CaptureResource],
    config: RequestOptions,
    cb: CallbackFunction[CaptureResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CallbackFunction[CaptureResource], config: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(
    id: String,
    data: CallbackFunction[CaptureResource],
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CaptureRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CaptureRequest, config: Unit, cb: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CaptureRequest, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CaptureRequest, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: CaptureRequest, config: CallbackFunction[CaptureResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(
    id: String,
    data: CaptureRequest,
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def get(id: String, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: RequestOptions, cb: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(
    id: String,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reauthorize(id: String, data: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: RequestOptions, config: Unit, cb: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: RequestOptions, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(
    id: String,
    data: RequestOptions,
    config: RequestOptions,
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: RequestOptions, config: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: Amount): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: Amount, config: Unit, cb: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: Amount, config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: Amount, config: RequestOptions, cb: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: Amount, config: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(
    id: String,
    data: Amount,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: CallbackFunction[AuthorizationResource]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: Unit,
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(id: String, data: CallbackFunction[AuthorizationResource], config: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: RequestOptions,
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reauthorize(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CaptureRequest extends StObject {
    
    var amount: js.UndefOr[Amount] = js.undefined
    
    var invoice_number: js.UndefOr[String] = js.undefined
    
    var is_final_capture: js.UndefOr[Boolean] = js.undefined
  }
  object CaptureRequest {
    
    @scala.inline
    def apply(): CaptureRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureRequest]
    }
    
    @scala.inline
    implicit class CaptureRequestMutableBuilder[Self <: CaptureRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Amount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
      
      @scala.inline
      def setIs_final_capture(value: Boolean): Self = StObject.set(x, "is_final_capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_final_captureUndefined: Self = StObject.set(x, "is_final_capture", js.undefined)
    }
  }
}
