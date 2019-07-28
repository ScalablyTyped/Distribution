package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseContent extends js.Object {
  var _links: ReposCreateFileResponseContentLinks
  var download_url: String
  var git_url: String
  var html_url: String
  var name: String
  var path: String
  var sha: String
  var size: Double
  var `type`: String
  var url: String
}

object ReposCreateFileResponseContent {
  @scala.inline
  def apply(
    _links: ReposCreateFileResponseContentLinks,
    download_url: String,
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): ReposCreateFileResponseContent = {
    val __obj = js.Dynamic.literal(_links = _links, download_url = download_url, git_url = git_url, html_url = html_url, name = name, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReposCreateFileResponseContent]
  }
}

