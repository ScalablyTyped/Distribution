package typings.phonegapPluginBarcodescanner

import typings.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.landscape
import typings.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phonegapBarcode {
  
  @js.native
  trait BarcodeScanOptions extends StObject {
    
    var disableAnimations: Boolean = js.native
    
    var disableSuccessBeep: js.UndefOr[Boolean] = js.native
    
    var formats: js.UndefOr[String] = js.native
    
    var orientation: js.UndefOr[landscape | portrait] = js.native
    
    var preferFrontCamera: js.UndefOr[Boolean] = js.native
    
    var prompt: js.UndefOr[String] = js.native
    
    var resultDisplayDuration: js.UndefOr[Double] = js.native
    
    var saveHistory: js.UndefOr[Boolean] = js.native
    
    var showFlipCameraButton: js.UndefOr[Boolean] = js.native
    
    var showTorchButton: js.UndefOr[Boolean] = js.native
    
    var torchOn: js.UndefOr[Boolean] = js.native
  }
  object BarcodeScanOptions {
    
    @scala.inline
    def apply(disableAnimations: Boolean): BarcodeScanOptions = {
      val __obj = js.Dynamic.literal(disableAnimations = disableAnimations.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeScanOptions]
    }
    
    @scala.inline
    implicit class BarcodeScanOptionsMutableBuilder[Self <: BarcodeScanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableAnimations(value: Boolean): Self = StObject.set(x, "disableAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSuccessBeep(value: Boolean): Self = StObject.set(x, "disableSuccessBeep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSuccessBeepUndefined: Self = StObject.set(x, "disableSuccessBeep", js.undefined)
      
      @scala.inline
      def setFormats(value: String): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPreferFrontCamera(value: Boolean): Self = StObject.set(x, "preferFrontCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferFrontCameraUndefined: Self = StObject.set(x, "preferFrontCamera", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setResultDisplayDuration(value: Double): Self = StObject.set(x, "resultDisplayDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultDisplayDurationUndefined: Self = StObject.set(x, "resultDisplayDuration", js.undefined)
      
      @scala.inline
      def setSaveHistory(value: Boolean): Self = StObject.set(x, "saveHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveHistoryUndefined: Self = StObject.set(x, "saveHistory", js.undefined)
      
      @scala.inline
      def setShowFlipCameraButton(value: Boolean): Self = StObject.set(x, "showFlipCameraButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFlipCameraButtonUndefined: Self = StObject.set(x, "showFlipCameraButton", js.undefined)
      
      @scala.inline
      def setShowTorchButton(value: Boolean): Self = StObject.set(x, "showTorchButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTorchButtonUndefined: Self = StObject.set(x, "showTorchButton", js.undefined)
      
      @scala.inline
      def setTorchOn(value: Boolean): Self = StObject.set(x, "torchOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTorchOnUndefined: Self = StObject.set(x, "torchOn", js.undefined)
    }
  }
  
  @js.native
  trait BarcodeScanResult extends StObject {
    
    var cancelled: Boolean = js.native
    
    var format: String = js.native
    
    var text: String = js.native
  }
  object BarcodeScanResult {
    
    @scala.inline
    def apply(cancelled: Boolean, format: String, text: String): BarcodeScanResult = {
      val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeScanResult]
    }
    
    @scala.inline
    implicit class BarcodeScanResultMutableBuilder[Self <: BarcodeScanResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BarcodeScanner extends StObject {
    
    var Encode: EncodingType = js.native
    
    def encode(encodingType: EncodingType, data: String, success: js.Function1[/* result */ js.Any, _]): Unit = js.native
    def encode(
      encodingType: EncodingType,
      data: String,
      success: js.Function1[/* result */ js.Any, _],
      failure: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    
    def scan(success: js.Function1[/* result */ BarcodeScanResult, _]): Unit = js.native
    def scan(
      success: js.Function1[/* result */ BarcodeScanResult, _],
      failure: js.UndefOr[scala.Nothing],
      opts: BarcodeScanOptions
    ): Unit = js.native
    def scan(
      success: js.Function1[/* result */ BarcodeScanResult, _],
      failure: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def scan(
      success: js.Function1[/* result */ BarcodeScanResult, _],
      failure: js.Function1[/* err */ js.Any, _],
      opts: BarcodeScanOptions
    ): Unit = js.native
  }
  
  @js.native
  trait EncodingType extends StObject {
    
    var EMAIL_TYPE: js.Any = js.native
    
    var PHONE_TYPE: js.Any = js.native
    
    var SMS_TYPE: js.Any = js.native
    
    var TEXT_TYPE: js.Any = js.native
  }
  object EncodingType {
    
    @scala.inline
    def apply(EMAIL_TYPE: js.Any, PHONE_TYPE: js.Any, SMS_TYPE: js.Any, TEXT_TYPE: js.Any): EncodingType = {
      val __obj = js.Dynamic.literal(EMAIL_TYPE = EMAIL_TYPE.asInstanceOf[js.Any], PHONE_TYPE = PHONE_TYPE.asInstanceOf[js.Any], SMS_TYPE = SMS_TYPE.asInstanceOf[js.Any], TEXT_TYPE = TEXT_TYPE.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingType]
    }
    
    @scala.inline
    implicit class EncodingTypeMutableBuilder[Self <: EncodingType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEMAIL_TYPE(value: js.Any): Self = StObject.set(x, "EMAIL_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPHONE_TYPE(value: js.Any): Self = StObject.set(x, "PHONE_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMS_TYPE(value: js.Any): Self = StObject.set(x, "SMS_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTEXT_TYPE(value: js.Any): Self = StObject.set(x, "TEXT_TYPE", value.asInstanceOf[js.Any])
    }
  }
}
