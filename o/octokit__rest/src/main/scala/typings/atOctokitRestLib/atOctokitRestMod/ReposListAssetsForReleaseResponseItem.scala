package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListAssetsForReleaseResponseItem extends js.Object {
  var browser_download_url: java.lang.String
  var content_type: java.lang.String
  var created_at: java.lang.String
  var download_count: scala.Double
  var id: scala.Double
  var label: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var size: scala.Double
  var state: java.lang.String
  var updated_at: java.lang.String
  var uploader: ReposListAssetsForReleaseResponseItemUploader
  var url: java.lang.String
}

object ReposListAssetsForReleaseResponseItem {
  @scala.inline
  def apply(
    browser_download_url: java.lang.String,
    content_type: java.lang.String,
    created_at: java.lang.String,
    download_count: scala.Double,
    id: scala.Double,
    label: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    size: scala.Double,
    state: java.lang.String,
    updated_at: java.lang.String,
    uploader: ReposListAssetsForReleaseResponseItemUploader,
    url: java.lang.String
  ): ReposListAssetsForReleaseResponseItem = {
    val __obj = js.Dynamic.literal(browser_download_url = browser_download_url, content_type = content_type, created_at = created_at, download_count = download_count, id = id, label = label, name = name, node_id = node_id, size = size, state = state, updated_at = updated_at, uploader = uploader, url = url)
  
    __obj.asInstanceOf[ReposListAssetsForReleaseResponseItem]
  }
}

