package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContentsResponseItem extends js.Object {
  var _links: ReposGetContentsResponseItemLinks
  var download_url: String | Null
  var git_url: String
  var html_url: String
  var name: String
  var path: String
  var sha: String
  var size: Double
  var `type`: String
  var url: String
}

object ReposGetContentsResponseItem {
  @scala.inline
  def apply(
    _links: ReposGetContentsResponseItemLinks,
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String,
    download_url: String = null
  ): ReposGetContentsResponseItem = {
    val __obj = js.Dynamic.literal(_links = _links, git_url = git_url, html_url = html_url, name = name, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    if (download_url != null) __obj.updateDynamic("download_url")(download_url)
    __obj.asInstanceOf[ReposGetContentsResponseItem]
  }
}

