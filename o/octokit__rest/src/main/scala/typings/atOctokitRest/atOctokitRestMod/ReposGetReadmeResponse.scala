package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReadmeResponse extends js.Object {
  var _links: ReposGetReadmeResponseLinks
  var content: String
  var download_url: String
  var encoding: String
  var git_url: String
  var html_url: String
  var name: String
  var path: String
  var sha: String
  var size: Double
  var `type`: String
  var url: String
}

object ReposGetReadmeResponse {
  @scala.inline
  def apply(
    _links: ReposGetReadmeResponseLinks,
    content: String,
    download_url: String,
    encoding: String,
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): ReposGetReadmeResponse = {
    val __obj = js.Dynamic.literal(_links = _links, content = content, download_url = download_url, encoding = encoding, git_url = git_url, html_url = html_url, name = name, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReposGetReadmeResponse]
  }
}

