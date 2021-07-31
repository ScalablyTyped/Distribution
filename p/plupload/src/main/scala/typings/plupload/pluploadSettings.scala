package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadSettings extends StObject {
  
  /** Required Options */
  var browse_button: js.Any
  
  /** Chunk */
  var chunk_size: js.UndefOr[Double | String] = js.undefined
  
  var container: js.UndefOr[js.Any] = js.undefined
  
  /** Drag&Drop Files from the Desktop */
  var drop_element: js.UndefOr[String] = js.undefined
  
  var file_data_name: js.UndefOr[String] = js.undefined
  
  /** Filters */
  var filters: js.UndefOr[pluploadFilters] = js.undefined
  
  var flash_swf_url: js.UndefOr[String] = js.undefined
  
  /** Control the request */
  var headers: js.UndefOr[js.Any] = js.undefined
  
  /** Events */
  var init: js.UndefOr[pluploadEvents] = js.undefined
  
  var max_retries: js.UndefOr[Double] = js.undefined
  
  /** Useful Options */
  var multi_selection: js.UndefOr[Boolean] = js.undefined
  
  var multipart: js.UndefOr[Boolean] = js.undefined
  
  var multipart_params: js.UndefOr[js.Any] = js.undefined
  
  var required_features: js.UndefOr[String | js.Any] = js.undefined
  
  /** Client-Side Image Resize */
  var resize: js.UndefOr[pluploadResize] = js.undefined
  
  /** Optional */
  var runtimes: js.UndefOr[String] = js.undefined
  
  var silverlight_xap_url: js.UndefOr[String] = js.undefined
  
  var unique_names: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object pluploadSettings {
  
  @scala.inline
  def apply(browse_button: js.Any, url: String): pluploadSettings = {
    val __obj = js.Dynamic.literal(browse_button = browse_button.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadSettings]
  }
  
  @scala.inline
  implicit class pluploadSettingsMutableBuilder[Self <: pluploadSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowse_button(value: js.Any): Self = StObject.set(x, "browse_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk_size(value: Double | String): Self = StObject.set(x, "chunk_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk_sizeUndefined: Self = StObject.set(x, "chunk_size", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDrop_element(value: String): Self = StObject.set(x, "drop_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop_elementUndefined: Self = StObject.set(x, "drop_element", js.undefined)
    
    @scala.inline
    def setFile_data_name(value: String): Self = StObject.set(x, "file_data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_data_nameUndefined: Self = StObject.set(x, "file_data_name", js.undefined)
    
    @scala.inline
    def setFilters(value: pluploadFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFlash_swf_url(value: String): Self = StObject.set(x, "flash_swf_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash_swf_urlUndefined: Self = StObject.set(x, "flash_swf_url", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setInit(value: pluploadEvents): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setMax_retries(value: Double): Self = StObject.set(x, "max_retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_retriesUndefined: Self = StObject.set(x, "max_retries", js.undefined)
    
    @scala.inline
    def setMulti_selection(value: Boolean): Self = StObject.set(x, "multi_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti_selectionUndefined: Self = StObject.set(x, "multi_selection", js.undefined)
    
    @scala.inline
    def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setMultipart_params(value: js.Any): Self = StObject.set(x, "multipart_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipart_paramsUndefined: Self = StObject.set(x, "multipart_params", js.undefined)
    
    @scala.inline
    def setRequired_features(value: String | js.Any): Self = StObject.set(x, "required_features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_featuresUndefined: Self = StObject.set(x, "required_features", js.undefined)
    
    @scala.inline
    def setResize(value: pluploadResize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setRuntimes(value: String): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    @scala.inline
    def setSilverlight_xap_url(value: String): Self = StObject.set(x, "silverlight_xap_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilverlight_xap_urlUndefined: Self = StObject.set(x, "silverlight_xap_url", js.undefined)
    
    @scala.inline
    def setUnique_names(value: Boolean): Self = StObject.set(x, "unique_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique_namesUndefined: Self = StObject.set(x, "unique_names", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
