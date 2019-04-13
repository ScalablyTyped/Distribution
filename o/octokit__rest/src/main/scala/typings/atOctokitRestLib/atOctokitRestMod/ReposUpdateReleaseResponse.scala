package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseResponse extends js.Object {
  var assets: js.Array[ReposUpdateReleaseResponseAssetsItem]
  var assets_url: java.lang.String
  var author: ReposUpdateReleaseResponseAuthor
  var body: java.lang.String
  var created_at: java.lang.String
  var draft: scala.Boolean
  var html_url: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var prerelease: scala.Boolean
  var published_at: java.lang.String
  var tag_name: java.lang.String
  var tarball_url: java.lang.String
  var target_commitish: java.lang.String
  var upload_url: java.lang.String
  var url: java.lang.String
  var zipball_url: java.lang.String
}

object ReposUpdateReleaseResponse {
  @scala.inline
  def apply(
    assets: js.Array[ReposUpdateReleaseResponseAssetsItem],
    assets_url: java.lang.String,
    author: ReposUpdateReleaseResponseAuthor,
    body: java.lang.String,
    created_at: java.lang.String,
    draft: scala.Boolean,
    html_url: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    prerelease: scala.Boolean,
    published_at: java.lang.String,
    tag_name: java.lang.String,
    tarball_url: java.lang.String,
    target_commitish: java.lang.String,
    upload_url: java.lang.String,
    url: java.lang.String,
    zipball_url: java.lang.String
  ): ReposUpdateReleaseResponse = {
    val __obj = js.Dynamic.literal(assets = assets, assets_url = assets_url, author = author, body = body, created_at = created_at, draft = draft, html_url = html_url, id = id, name = name, node_id = node_id, prerelease = prerelease, published_at = published_at, tag_name = tag_name, tarball_url = tarball_url, target_commitish = target_commitish, upload_url = upload_url, url = url, zipball_url = zipball_url)
  
    __obj.asInstanceOf[ReposUpdateReleaseResponse]
  }
}

