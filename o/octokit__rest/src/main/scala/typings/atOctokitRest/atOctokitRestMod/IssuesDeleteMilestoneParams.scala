package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteMilestoneParams]
  }
}

