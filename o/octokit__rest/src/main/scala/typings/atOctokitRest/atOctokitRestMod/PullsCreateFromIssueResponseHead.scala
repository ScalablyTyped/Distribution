package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueResponseHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsCreateFromIssueResponseHeadRepo
  var sha: String
  var user: PullsCreateFromIssueResponseHeadUser
}

object PullsCreateFromIssueResponseHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsCreateFromIssueResponseHeadRepo,
    sha: String,
    user: PullsCreateFromIssueResponseHeadUser
  ): PullsCreateFromIssueResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseHead]
  }
}

