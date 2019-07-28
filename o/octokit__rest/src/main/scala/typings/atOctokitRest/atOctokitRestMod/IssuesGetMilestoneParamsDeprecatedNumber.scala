package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetMilestoneParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "milestone_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object IssuesGetMilestoneParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String): IssuesGetMilestoneParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesGetMilestoneParamsDeprecatedNumber]
  }
}

