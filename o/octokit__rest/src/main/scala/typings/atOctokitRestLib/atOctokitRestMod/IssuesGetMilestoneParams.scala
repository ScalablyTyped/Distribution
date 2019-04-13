package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetMilestoneParams extends js.Object {
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesGetMilestoneParams {
  @scala.inline
  def apply(number: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesGetMilestoneParams = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesGetMilestoneParams]
  }
}

