package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.ReposGetContentsResponseLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var _links: ReposGetContentsResponseLinks
  var content: js.UndefOr[String] = js.undefined
  var download_url: String | Null
  var encoding: js.UndefOr[String] = js.undefined
  var git_url: String
  var html_url: String
  var name: String
  var path: String
  var sha: String
  var size: Double
  var submodule_git_url: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var `type`: String
  var url: String
}

object Anon_Content {
  @scala.inline
  def apply(
    _links: ReposGetContentsResponseLinks,
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String,
    content: String = null,
    download_url: String = null,
    encoding: String = null,
    submodule_git_url: String = null,
    target: String = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(_links = _links, git_url = git_url, html_url = html_url, name = name, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (download_url != null) __obj.updateDynamic("download_url")(download_url)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (submodule_git_url != null) __obj.updateDynamic("submodule_git_url")(submodule_git_url)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Content]
  }
}

