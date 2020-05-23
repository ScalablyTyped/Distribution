package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloadurl extends js.Object {
  var _links: Self
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

object Downloadurl {
  @scala.inline
  def apply(
    _links: Self,
    download_url: String,
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): Downloadurl = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadurl]
  }
}

