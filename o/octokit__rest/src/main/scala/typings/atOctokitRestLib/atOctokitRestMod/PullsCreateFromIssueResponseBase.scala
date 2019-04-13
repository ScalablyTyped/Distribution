package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueResponseBase extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsCreateFromIssueResponseBaseRepo
  var sha: java.lang.String
  var user: PullsCreateFromIssueResponseBaseUser
}

object PullsCreateFromIssueResponseBase {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsCreateFromIssueResponseBaseRepo,
    sha: java.lang.String,
    user: PullsCreateFromIssueResponseBaseUser
  ): PullsCreateFromIssueResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseBase]
  }
}

