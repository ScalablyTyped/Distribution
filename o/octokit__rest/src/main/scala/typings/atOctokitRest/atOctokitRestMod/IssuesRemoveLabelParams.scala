package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelParams extends js.Object {
  var issue_number: Double
  var name: String
  var owner: String
  var repo: String
}

object IssuesRemoveLabelParams {
  @scala.inline
  def apply(issue_number: Double, name: String, owner: String, repo: String): IssuesRemoveLabelParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, name = name, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesRemoveLabelParams]
  }
}

