package typings.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUploadOptions extends js.Object {
  
  /**
    * Standard HTML accept attr, browser specific select popup window
    * @type {string}
    */
  var ngfAccept: js.UndefOr[String] = js.native
  
  /**
    * Default true, allow dropping files only for Chrome webkit browser
    * @type {boolean}
    */
  var ngfAllowDir: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false, enable firefox image paste by making element contenteditable
    * @type {boolean}
    */
  var ngfEnableFirefoxPaste: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false, hides element if file drag&drop is not
    * @type {boolean}
    */
  var ngfHideOnDropNotAvailable: js.UndefOr[Boolean] = js.native
  
  /**
    * Validate error name: maxDuration
    * @type {(number|string)}
    */
  var ngfMaxDuration: js.UndefOr[Double | String] = js.native
  
  /**
    * Maximum number of files allowed to be selected or dropped, validate error name: maxFiles
    * @type {number}
    */
  var ngfMaxFiles: js.UndefOr[Double] = js.native
  
  /**
    * Validate error name: maxSize
    * @type {(number|string)}
    */
  var ngfMaxSize: js.UndefOr[Double | String] = js.native
  
  /**
    * Validate error name: maxTotalSize
    * @type {(number|string)}
    */
  var ngfMaxTotalSize: js.UndefOr[Double | String] = js.native
  
  /**
    * Validate error name: minDuration
    * @type {(number|string)}
    */
  var ngfMinDuration: js.UndefOr[Double | String] = js.native
  
  /**
    * Validate error name: minRatio
    * @type {(number|string)}
    */
  var ngfMinRatio: js.UndefOr[Double | String] = js.native
  
  /**
    * Validate error name: minSize
    * @type {(number|string)}
    */
  var ngfMinSize: js.UndefOr[Double | String] = js.native
  
  /**
    * Allows selecting multiple files
    * @type {boolean}
    */
  var ngfMultiple: js.UndefOr[Boolean] = js.native
  
  /**
    * List of comma separated valid aspect ratio of images in float or 2:3 format
    * @type {string}
    */
  var ngfRatio: js.UndefOr[String] = js.native
  
  /**
    * Default false, whether to propagate drag/drop events.
    * @type {boolean}
    */
  var ngfStopPropagation: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false, if true file.$error will be set if the dimension or duration
    * values for validations cannot be calculated for example image load error or unsupported video by the browser.
    * By default it would assume the file is valid if the duration or dimension cannot be calculated by the browser.
    * @type {boolean}
    */
  var ngfValidateForce: js.UndefOr[Boolean] = js.native
}
object FileUploadOptions {
  
  @scala.inline
  def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  
  @scala.inline
  implicit class FileUploadOptionsOps[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
    
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
    def setNgfAccept(value: String): Self = this.set("ngfAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfAccept: Self = this.set("ngfAccept", js.undefined)
    
    @scala.inline
    def setNgfAllowDir(value: Boolean): Self = this.set("ngfAllowDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfAllowDir: Self = this.set("ngfAllowDir", js.undefined)
    
    @scala.inline
    def setNgfEnableFirefoxPaste(value: Boolean): Self = this.set("ngfEnableFirefoxPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfEnableFirefoxPaste: Self = this.set("ngfEnableFirefoxPaste", js.undefined)
    
    @scala.inline
    def setNgfHideOnDropNotAvailable(value: Boolean): Self = this.set("ngfHideOnDropNotAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfHideOnDropNotAvailable: Self = this.set("ngfHideOnDropNotAvailable", js.undefined)
    
    @scala.inline
    def setNgfMaxDuration(value: Double | String): Self = this.set("ngfMaxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMaxDuration: Self = this.set("ngfMaxDuration", js.undefined)
    
    @scala.inline
    def setNgfMaxFiles(value: Double): Self = this.set("ngfMaxFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMaxFiles: Self = this.set("ngfMaxFiles", js.undefined)
    
    @scala.inline
    def setNgfMaxSize(value: Double | String): Self = this.set("ngfMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMaxSize: Self = this.set("ngfMaxSize", js.undefined)
    
    @scala.inline
    def setNgfMaxTotalSize(value: Double | String): Self = this.set("ngfMaxTotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMaxTotalSize: Self = this.set("ngfMaxTotalSize", js.undefined)
    
    @scala.inline
    def setNgfMinDuration(value: Double | String): Self = this.set("ngfMinDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMinDuration: Self = this.set("ngfMinDuration", js.undefined)
    
    @scala.inline
    def setNgfMinRatio(value: Double | String): Self = this.set("ngfMinRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMinRatio: Self = this.set("ngfMinRatio", js.undefined)
    
    @scala.inline
    def setNgfMinSize(value: Double | String): Self = this.set("ngfMinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMinSize: Self = this.set("ngfMinSize", js.undefined)
    
    @scala.inline
    def setNgfMultiple(value: Boolean): Self = this.set("ngfMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfMultiple: Self = this.set("ngfMultiple", js.undefined)
    
    @scala.inline
    def setNgfRatio(value: String): Self = this.set("ngfRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfRatio: Self = this.set("ngfRatio", js.undefined)
    
    @scala.inline
    def setNgfStopPropagation(value: Boolean): Self = this.set("ngfStopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfStopPropagation: Self = this.set("ngfStopPropagation", js.undefined)
    
    @scala.inline
    def setNgfValidateForce(value: Boolean): Self = this.set("ngfValidateForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgfValidateForce: Self = this.set("ngfValidateForce", js.undefined)
  }
}
