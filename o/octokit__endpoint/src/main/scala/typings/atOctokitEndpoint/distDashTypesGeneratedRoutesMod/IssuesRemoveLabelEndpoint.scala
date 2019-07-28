package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelEndpoint extends js.Object {
  var issue_number: Double
  var name: String
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesRemoveLabelEndpoint {
  @scala.inline
  def apply(issue_number: Double, name: String, owner: String, repo: String, number: Int | Double = null): IssuesRemoveLabelEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, name = name, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveLabelEndpoint]
  }
}

