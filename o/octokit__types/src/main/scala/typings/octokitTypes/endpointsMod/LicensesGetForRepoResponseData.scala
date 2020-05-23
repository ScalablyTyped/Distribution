package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Name
import typings.octokitTypes.anon.Self
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetForRepoResponseData extends js.Object {
  var _links: Self
  var content: String
  var download_url: String
  var encoding: String
  var git_url: String
  var html_url: String
  var license: Name
  var name: String
  var path: String
  var sha: String
  var size: Double
  var `type`: String
  var url: String
}

object LicensesGetForRepoResponseData {
  @scala.inline
  def apply(
    _links: Self,
    content: String,
    download_url: String,
    encoding: String,
    git_url: String,
    html_url: String,
    license: Name,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): LicensesGetForRepoResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetForRepoResponseData]
  }
}

