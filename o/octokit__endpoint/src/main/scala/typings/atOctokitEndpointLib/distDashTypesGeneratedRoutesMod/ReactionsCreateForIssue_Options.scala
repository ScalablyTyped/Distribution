package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssue_Options extends js.Object {
  var content: java.lang.String
  var issue_number: scala.Double
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReactionsCreateForIssue_Options {
  @scala.inline
  def apply(
    content: java.lang.String,
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null
  ): ReactionsCreateForIssue_Options = {
    val __obj = js.Dynamic.literal(content = content, issue_number = issue_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForIssue_Options]
  }
}

