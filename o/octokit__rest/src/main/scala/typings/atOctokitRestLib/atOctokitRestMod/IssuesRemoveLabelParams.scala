package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelParams extends js.Object {
  var issue_number: scala.Double
  var name: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesRemoveLabelParams {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String
  ): IssuesRemoveLabelParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, name = name, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesRemoveLabelParams]
  }
}

