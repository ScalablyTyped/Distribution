package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseBase]
  }
}

