package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetParams extends js.Object {
  var issue_number: Double
  var owner: String
  var repo: String
}

object IssuesGetParams {
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String): IssuesGetParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesGetParams]
  }
}

