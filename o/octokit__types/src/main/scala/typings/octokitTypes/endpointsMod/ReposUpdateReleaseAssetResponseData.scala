package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateReleaseAssetResponseData extends StObject {
  
  var browser_download_url: String
  
  var content_type: String
  
  var created_at: String
  
  var download_count: Double
  
  var id: Double
  
  var label: String
  
  var name: String
  
  var node_id: String
  
  var size: Double
  
  var state: String
  
  var updated_at: String
  
  var uploader: Avatarurl
  
  var url: String
}
object ReposUpdateReleaseAssetResponseData {
  
  @scala.inline
  def apply(
    browser_download_url: String,
    content_type: String,
    created_at: String,
    download_count: Double,
    id: Double,
    label: String,
    name: String,
    node_id: String,
    size: Double,
    state: String,
    updated_at: String,
    uploader: Avatarurl,
    url: String
  ): ReposUpdateReleaseAssetResponseData = {
    val __obj = js.Dynamic.literal(browser_download_url = browser_download_url.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateReleaseAssetResponseData]
  }
  
  @scala.inline
  implicit class ReposUpdateReleaseAssetResponseDataMutableBuilder[Self <: ReposUpdateReleaseAssetResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser_download_url(value: String): Self = StObject.set(x, "browser_download_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload_count(value: Double): Self = StObject.set(x, "download_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader(value: Avatarurl): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
