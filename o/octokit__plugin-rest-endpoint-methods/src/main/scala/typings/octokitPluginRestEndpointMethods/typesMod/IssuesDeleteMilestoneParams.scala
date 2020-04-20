package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteMilestoneParams extends js.Object {
  var milestone_number: Double
  var owner: String
  var repo: String
}

object IssuesDeleteMilestoneParams {
  @scala.inline
  def apply(milestone_number: Double, owner: String, repo: String): IssuesDeleteMilestoneParams = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesDeleteMilestoneParams]
  }
}

