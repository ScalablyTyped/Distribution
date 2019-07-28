package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUnlockParams extends js.Object {
  var issue_number: Double
  var owner: String
  var repo: String
}

object IssuesUnlockParams {
  @scala.inline
  def apply(issue_number: Double, owner: String, repo: String): IssuesUnlockParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesUnlockParams]
  }
}

