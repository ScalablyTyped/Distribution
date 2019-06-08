package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseContent extends js.Object {
  var _links: ReposCreateOrUpdateFileResponseContentLinks
  var download_url: java.lang.String
  var git_url: java.lang.String
  var html_url: java.lang.String
  var name: java.lang.String
  var path: java.lang.String
  var sha: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  var url: java.lang.String
}

object ReposCreateOrUpdateFileResponseContent {
  @scala.inline
  def apply(
    _links: ReposCreateOrUpdateFileResponseContentLinks,
    download_url: java.lang.String,
    git_url: java.lang.String,
    html_url: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    sha: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    url: java.lang.String
  ): ReposCreateOrUpdateFileResponseContent = {
    val __obj = js.Dynamic.literal(_links = _links, download_url = download_url, git_url = git_url, html_url = html_url, name = name, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseContent]
  }
}

