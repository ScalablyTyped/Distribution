package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabel_Options extends js.Object {
  var issue_number: scala.Double
  var name: java.lang.String
  var number: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesRemoveLabel_Options {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    number: scala.Int | scala.Double = null
  ): IssuesRemoveLabel_Options = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, name = name, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveLabel_Options]
  }
}

