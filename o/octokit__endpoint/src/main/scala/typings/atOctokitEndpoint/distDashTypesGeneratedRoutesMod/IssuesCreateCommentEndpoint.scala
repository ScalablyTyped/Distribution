package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateCommentEndpoint extends js.Object {
  var body: String
  var issue_number: Double
  var number: js.UndefOr[Double] = js.undefined
  var owner: String
  var repo: String
}

object IssuesCreateCommentEndpoint {
  @scala.inline
  def apply(body: String, issue_number: Double, owner: String, repo: String, number: Int | Double = null): IssuesCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, issue_number = issue_number, owner = owner, repo = repo)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateCommentEndpoint]
  }
}

