package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListReleasesResponseItem extends js.Object {
  var assets: js.Array[ReposListReleasesResponseItemAssetsItem]
  var assets_url: String
  var author: ReposListReleasesResponseItemAuthor
  var body: String
  var created_at: String
  var draft: Boolean
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var prerelease: Boolean
  var published_at: String
  var tag_name: String
  var tarball_url: String
  var target_commitish: String
  var upload_url: String
  var url: String
  var zipball_url: String
}

object ReposListReleasesResponseItem {
  @scala.inline
  def apply(
    assets: js.Array[ReposListReleasesResponseItemAssetsItem],
    assets_url: String,
    author: ReposListReleasesResponseItemAuthor,
    body: String,
    created_at: String,
    draft: Boolean,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    prerelease: Boolean,
    published_at: String,
    tag_name: String,
    tarball_url: String,
    target_commitish: String,
    upload_url: String,
    url: String,
    zipball_url: String
  ): ReposListReleasesResponseItem = {
    val __obj = js.Dynamic.literal(assets = assets, assets_url = assets_url, author = author, body = body, created_at = created_at, draft = draft, html_url = html_url, id = id, name = name, node_id = node_id, prerelease = prerelease, published_at = published_at, tag_name = tag_name, tarball_url = tarball_url, target_commitish = target_commitish, upload_url = upload_url, url = url, zipball_url = zipball_url)
  
    __obj.asInstanceOf[ReposListReleasesResponseItem]
  }
}

