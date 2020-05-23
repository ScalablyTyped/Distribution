package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelEndpoint extends js.Object {
  var issue_number: Double
  var name: String
  var owner: String
  var repo: String
}

object IssuesRemoveLabelEndpoint {
  @scala.inline
  def apply(issue_number: Double, name: String, owner: String, repo: String): IssuesRemoveLabelEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesRemoveLabelEndpoint]
  }
}

