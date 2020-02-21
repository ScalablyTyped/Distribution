package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseResponseAssetsItem extends js.Object {
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
  var uploader: ReposGetReleaseResponseAssetsItemUploader
  var url: String
}

object ReposGetReleaseResponseAssetsItem {
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
    uploader: ReposGetReleaseResponseAssetsItemUploader,
    url: String
  ): ReposGetReleaseResponseAssetsItem = {
    val __obj = js.Dynamic.literal(browser_download_url = browser_download_url.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetReleaseResponseAssetsItem]
  }
}

