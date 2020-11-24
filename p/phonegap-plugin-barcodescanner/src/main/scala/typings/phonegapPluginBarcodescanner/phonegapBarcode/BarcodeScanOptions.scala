package typings.phonegapPluginBarcodescanner.phonegapBarcode

import typings.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.landscape
import typings.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarcodeScanOptions extends js.Object {
  
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
  implicit class BarcodeScanOptionsOps[Self <: BarcodeScanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableAnimations(value: Boolean): Self = this.set("disableAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSuccessBeep(value: Boolean): Self = this.set("disableSuccessBeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSuccessBeep: Self = this.set("disableSuccessBeep", js.undefined)
    
    @scala.inline
    def setFormats(value: String): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setOrientation(value: landscape | portrait): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPreferFrontCamera(value: Boolean): Self = this.set("preferFrontCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferFrontCamera: Self = this.set("preferFrontCamera", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setResultDisplayDuration(value: Double): Self = this.set("resultDisplayDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultDisplayDuration: Self = this.set("resultDisplayDuration", js.undefined)
    
    @scala.inline
    def setSaveHistory(value: Boolean): Self = this.set("saveHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveHistory: Self = this.set("saveHistory", js.undefined)
    
    @scala.inline
    def setShowFlipCameraButton(value: Boolean): Self = this.set("showFlipCameraButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFlipCameraButton: Self = this.set("showFlipCameraButton", js.undefined)
    
    @scala.inline
    def setShowTorchButton(value: Boolean): Self = this.set("showTorchButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTorchButton: Self = this.set("showTorchButton", js.undefined)
    
    @scala.inline
    def setTorchOn(value: Boolean): Self = this.set("torchOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTorchOn: Self = this.set("torchOn", js.undefined)
  }
}
