package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluploadSettings extends js.Object {
  
  /** Required Options */
  var browse_button: js.Any = js.native
  
  /** Chunk */
  var chunk_size: js.UndefOr[Double | String] = js.native
  
  var container: js.UndefOr[js.Any] = js.native
  
  /** Drag&Drop Files from the Desktop */
  var drop_element: js.UndefOr[String] = js.native
  
  var file_data_name: js.UndefOr[String] = js.native
  
  /** Filters */
  var filters: js.UndefOr[pluploadFilters] = js.native
  
  var flash_swf_url: js.UndefOr[String] = js.native
  
  /** Control the request */
  var headers: js.UndefOr[js.Any] = js.native
  
  /** Events */
  var init: js.UndefOr[pluploadEvents] = js.native
  
  var max_retries: js.UndefOr[Double] = js.native
  
  /** Useful Options */
  var multi_selection: js.UndefOr[Boolean] = js.native
  
  var multipart: js.UndefOr[Boolean] = js.native
  
  var multipart_params: js.UndefOr[js.Any] = js.native
  
  var required_features: js.UndefOr[String | js.Any] = js.native
  
  /** Client-Side Image Resize */
  var resize: js.UndefOr[pluploadResize] = js.native
  
  /** Optional */
  var runtimes: js.UndefOr[String] = js.native
  
  var silverlight_xap_url: js.UndefOr[String] = js.native
  
  var unique_names: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
}
object pluploadSettings {
  
  @scala.inline
  def apply(browse_button: js.Any, url: String): pluploadSettings = {
    val __obj = js.Dynamic.literal(browse_button = browse_button.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadSettings]
  }
  
  @scala.inline
  implicit class pluploadSettingsOps[Self <: pluploadSettings] (val x: Self) extends AnyVal {
    
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
    def setBrowse_button(value: js.Any): Self = this.set("browse_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk_size(value: Double | String): Self = this.set("chunk_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunk_size: Self = this.set("chunk_size", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDrop_element(value: String): Self = this.set("drop_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop_element: Self = this.set("drop_element", js.undefined)
    
    @scala.inline
    def setFile_data_name(value: String): Self = this.set("file_data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_data_name: Self = this.set("file_data_name", js.undefined)
    
    @scala.inline
    def setFilters(value: pluploadFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setFlash_swf_url(value: String): Self = this.set("flash_swf_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlash_swf_url: Self = this.set("flash_swf_url", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setInit(value: pluploadEvents): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setMax_retries(value: Double): Self = this.set("max_retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_retries: Self = this.set("max_retries", js.undefined)
    
    @scala.inline
    def setMulti_selection(value: Boolean): Self = this.set("multi_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti_selection: Self = this.set("multi_selection", js.undefined)
    
    @scala.inline
    def setMultipart(value: Boolean): Self = this.set("multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    
    @scala.inline
    def setMultipart_params(value: js.Any): Self = this.set("multipart_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart_params: Self = this.set("multipart_params", js.undefined)
    
    @scala.inline
    def setRequired_features(value: String | js.Any): Self = this.set("required_features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired_features: Self = this.set("required_features", js.undefined)
    
    @scala.inline
    def setResize(value: pluploadResize): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setRuntimes(value: String): Self = this.set("runtimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimes: Self = this.set("runtimes", js.undefined)
    
    @scala.inline
    def setSilverlight_xap_url(value: String): Self = this.set("silverlight_xap_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilverlight_xap_url: Self = this.set("silverlight_xap_url", js.undefined)
    
    @scala.inline
    def setUnique_names(value: Boolean): Self = this.set("unique_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique_names: Self = this.set("unique_names", js.undefined)
  }
}
