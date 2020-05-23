package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codeofconduct extends js.Object {
  var code_of_conduct: HtmlurlKey
  var contributing: HtmlurlUrl
  var issue_template: HtmlurlUrl
  var license: Spdxid
  var pull_request_template: HtmlurlUrl
  var readme: HtmlurlUrl
}

object Codeofconduct {
  @scala.inline
  def apply(
    code_of_conduct: HtmlurlKey,
    contributing: HtmlurlUrl,
    issue_template: HtmlurlUrl,
    license: Spdxid,
    pull_request_template: HtmlurlUrl,
    readme: HtmlurlUrl
  ): Codeofconduct = {
    val __obj = js.Dynamic.literal(code_of_conduct = code_of_conduct.asInstanceOf[js.Any], contributing = contributing.asInstanceOf[js.Any], issue_template = issue_template.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], pull_request_template = pull_request_template.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codeofconduct]
  }
}

