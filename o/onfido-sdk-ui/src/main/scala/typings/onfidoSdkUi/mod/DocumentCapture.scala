package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Documenttype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentCapture extends StObject {
  
  var auto_capture_enabled_documents: js.UndefOr[js.Array[Documenttype]] = js.undefined
  
  var auto_capture_timeout_ms: js.UndefOr[Double] = js.undefined
  
  var enable_auto_capture_doc_capture: js.UndefOr[Boolean] = js.undefined
  
  var enable_js_camera_doc_capture: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The number of additional image quality retries that should return an error if an image quality validation is detected.
  	 * This means that if image quality validations are detected, the user will only see an error on the first [1 + max_total_retries] upload attempt.
  	 * From the [1 + max_total_retries + 1] attempt, if image quality validations are detected, the user will see a warning and they use can choose to
  	 * proceed regardless of the image quality warning.
  	 */
  var max_total_retries: Double
  
  var sign_document_video_upload: js.UndefOr[Boolean] = js.undefined
  
  var torch_turn_on_timeMs: js.UndefOr[Double] = js.undefined
  
  var video_bitrate: js.UndefOr[Double] = js.undefined
  
  var video_length_ms: js.UndefOr[Double] = js.undefined
}
object DocumentCapture {
  
  inline def apply(max_total_retries: Double): DocumentCapture = {
    val __obj = js.Dynamic.literal(max_total_retries = max_total_retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCapture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentCapture] (val x: Self) extends AnyVal {
    
    inline def setAuto_capture_enabled_documents(value: js.Array[Documenttype]): Self = StObject.set(x, "auto_capture_enabled_documents", value.asInstanceOf[js.Any])
    
    inline def setAuto_capture_enabled_documentsUndefined: Self = StObject.set(x, "auto_capture_enabled_documents", js.undefined)
    
    inline def setAuto_capture_enabled_documentsVarargs(value: Documenttype*): Self = StObject.set(x, "auto_capture_enabled_documents", js.Array(value*))
    
    inline def setAuto_capture_timeout_ms(value: Double): Self = StObject.set(x, "auto_capture_timeout_ms", value.asInstanceOf[js.Any])
    
    inline def setAuto_capture_timeout_msUndefined: Self = StObject.set(x, "auto_capture_timeout_ms", js.undefined)
    
    inline def setEnable_auto_capture_doc_capture(value: Boolean): Self = StObject.set(x, "enable_auto_capture_doc_capture", value.asInstanceOf[js.Any])
    
    inline def setEnable_auto_capture_doc_captureUndefined: Self = StObject.set(x, "enable_auto_capture_doc_capture", js.undefined)
    
    inline def setEnable_js_camera_doc_capture(value: Boolean): Self = StObject.set(x, "enable_js_camera_doc_capture", value.asInstanceOf[js.Any])
    
    inline def setEnable_js_camera_doc_captureUndefined: Self = StObject.set(x, "enable_js_camera_doc_capture", js.undefined)
    
    inline def setMax_total_retries(value: Double): Self = StObject.set(x, "max_total_retries", value.asInstanceOf[js.Any])
    
    inline def setSign_document_video_upload(value: Boolean): Self = StObject.set(x, "sign_document_video_upload", value.asInstanceOf[js.Any])
    
    inline def setSign_document_video_uploadUndefined: Self = StObject.set(x, "sign_document_video_upload", js.undefined)
    
    inline def setTorch_turn_on_timeMs(value: Double): Self = StObject.set(x, "torch_turn_on_timeMs", value.asInstanceOf[js.Any])
    
    inline def setTorch_turn_on_timeMsUndefined: Self = StObject.set(x, "torch_turn_on_timeMs", js.undefined)
    
    inline def setVideo_bitrate(value: Double): Self = StObject.set(x, "video_bitrate", value.asInstanceOf[js.Any])
    
    inline def setVideo_bitrateUndefined: Self = StObject.set(x, "video_bitrate", js.undefined)
    
    inline def setVideo_length_ms(value: Double): Self = StObject.set(x, "video_length_ms", value.asInstanceOf[js.Any])
    
    inline def setVideo_length_msUndefined: Self = StObject.set(x, "video_length_ms", js.undefined)
  }
}
