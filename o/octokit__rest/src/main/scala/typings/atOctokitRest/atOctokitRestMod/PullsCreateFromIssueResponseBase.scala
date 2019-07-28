package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueResponseBase extends js.Object {
  var label: String
  var ref: String
  var repo: PullsCreateFromIssueResponseBaseRepo
  var sha: String
  var user: PullsCreateFromIssueResponseBaseUser
}

object PullsCreateFromIssueResponseBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsCreateFromIssueResponseBaseRepo,
    sha: String,
    user: PullsCreateFromIssueResponseBaseUser
  ): PullsCreateFromIssueResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseBase]
  }
}

