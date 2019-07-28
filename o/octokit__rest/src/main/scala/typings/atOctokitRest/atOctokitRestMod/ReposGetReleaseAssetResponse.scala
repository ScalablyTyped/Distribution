package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseAssetResponse extends js.Object {
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
  var uploader: ReposGetReleaseAssetResponseUploader
  var url: String
}

object ReposGetReleaseAssetResponse {
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
    uploader: ReposGetReleaseAssetResponseUploader,
    url: String
  ): ReposGetReleaseAssetResponse = {
    val __obj = js.Dynamic.literal(browser_download_url = browser_download_url, content_type = content_type, created_at = created_at, download_count = download_count, id = id, label = label, name = name, node_id = node_id, size = size, state = state, updated_at = updated_at, uploader = uploader, url = url)
  
    __obj.asInstanceOf[ReposGetReleaseAssetResponse]
  }
}

