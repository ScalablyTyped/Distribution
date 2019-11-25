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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (download_url != null) __obj.updateDynamic("download_url")(download_url.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (submodule_git_url != null) __obj.updateDynamic("submodule_git_url")(submodule_git_url.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

