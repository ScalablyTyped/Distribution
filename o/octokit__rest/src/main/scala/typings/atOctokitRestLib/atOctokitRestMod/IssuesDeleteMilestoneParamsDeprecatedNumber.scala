package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteMilestoneParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "milestone_number"
    */
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesDeleteMilestoneParamsDeprecatedNumber {
  @scala.inline
  def apply(number: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesDeleteMilestoneParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteMilestoneParamsDeprecatedNumber]
  }
}

