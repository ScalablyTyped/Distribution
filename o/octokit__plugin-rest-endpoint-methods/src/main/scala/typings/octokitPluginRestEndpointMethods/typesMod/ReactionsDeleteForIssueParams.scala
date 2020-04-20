package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsDeleteForIssueParams extends js.Object {
  var issue_number: Double
  var owner: String
  var reaction_id: Double
  var repo: String
}

object ReactionsDeleteForIssueParams {
  @scala.inline
  def apply(issue_number: Double, owner: String, reaction_id: Double, repo: String): ReactionsDeleteForIssueParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForIssueParams]
  }
}

