package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUploadReleaseAssetResponseData extends js.Object {
  var browser_download_url: String = js.native
  var content_type: String = js.native
  var created_at: String = js.native
  var download_count: Double = js.native
  var id: Double = js.native
  var label: String = js.native
  var name: String = js.native
  var node_id: String = js.native
  var size: Double = js.native
  var state: String = js.native
  var updated_at: String = js.native
  var uploader: Avatarurl = js.native
  var url: String = js.native
}

object ReposUploadReleaseAssetResponseData {
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
  ): ReposUploadReleaseAssetResponseData = {
    val __obj = js.Dynamic.literal(browser_download_url = browser_download_url.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetResponseData]
  }
  @scala.inline
  implicit class ReposUploadReleaseAssetResponseDataOps[Self <: ReposUploadReleaseAssetResponseData] (val x: Self) extends AnyVal {
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
    def setBrowser_download_url(value: String): Self = this.set("browser_download_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownload_count(value: Double): Self = this.set("download_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploader(value: Avatarurl): Self = this.set("uploader", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

