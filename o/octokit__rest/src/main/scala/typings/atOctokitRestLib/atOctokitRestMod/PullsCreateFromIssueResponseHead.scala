package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueResponseHead extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsCreateFromIssueResponseHeadRepo
  var sha: java.lang.String
  var user: PullsCreateFromIssueResponseHeadUser
}

object PullsCreateFromIssueResponseHead {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsCreateFromIssueResponseHeadRepo,
    sha: java.lang.String,
    user: PullsCreateFromIssueResponseHeadUser
  ): PullsCreateFromIssueResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseHead]
  }
}

