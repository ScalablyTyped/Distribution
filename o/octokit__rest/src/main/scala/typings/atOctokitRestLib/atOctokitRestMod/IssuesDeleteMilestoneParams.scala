package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteMilestoneParams extends js.Object {
  var milestone_number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesDeleteMilestoneParams {
  @scala.inline
  def apply(milestone_number: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesDeleteMilestoneParams = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteMilestoneParams]
  }
}

