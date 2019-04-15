package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitResponseItemHead extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: ReposListPullRequestsAssociatedWithCommitResponseItemHeadRepo
  var sha: java.lang.String
  var user: ReposListPullRequestsAssociatedWithCommitResponseItemHeadUser
}

object ReposListPullRequestsAssociatedWithCommitResponseItemHead {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: ReposListPullRequestsAssociatedWithCommitResponseItemHeadRepo,
    sha: java.lang.String,
    user: ReposListPullRequestsAssociatedWithCommitResponseItemHeadUser
  ): ReposListPullRequestsAssociatedWithCommitResponseItemHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemHead]
  }
}

