package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReadmeResponse extends js.Object {
  var _links: ReposGetReadmeResponseLinks
  var content: java.lang.String
  var download_url: java.lang.String
  var encoding: java.lang.String
  var git_url: java.lang.String
  var html_url: java.lang.String
  var name: java.lang.String
  var path: java.lang.String
  var sha: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  var url: java.lang.String
}

object ReposGetReadmeResponse {
  @scala.inline
  def apply(
    _links: ReposGetReadmeResponseLinks,
    content: java.lang.String,
    download_url: java.lang.String,
    encoding: java.lang.String,
    git_url: java.lang.String,
    html_url: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    sha: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    url: java.lang.String
  ): ReposGetReadmeResponse = {
    val __obj = js.Dynamic.literal(_links = _links, content = content, download_url = download_url, encoding = encoding, git_url = git_url, html_url = html_url, name = name, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReposGetReadmeResponse]
  }
}

