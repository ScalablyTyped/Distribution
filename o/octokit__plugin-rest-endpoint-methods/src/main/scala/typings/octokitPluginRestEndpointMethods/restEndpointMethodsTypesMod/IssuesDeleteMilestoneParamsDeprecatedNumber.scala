package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteMilestoneParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "milestone_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object IssuesDeleteMilestoneParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String): IssuesDeleteMilestoneParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesDeleteMilestoneParamsDeprecatedNumber]
  }
}

