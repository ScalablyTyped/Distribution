package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUnlockParams extends js.Object {
  var issue_number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesUnlockParams {
  @scala.inline
  def apply(issue_number: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesUnlockParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesUnlockParams]
  }
}

