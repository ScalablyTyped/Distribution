package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetEndpoint extends js.Object {
  var issue_number: Double
  var owner: String
  var repo: String
}

object IssuesGetEndpoint {
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String): IssuesGetEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetEndpoint]
  }
}

