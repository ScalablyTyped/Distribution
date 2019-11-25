package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitResponseItemHead extends js.Object {
  var label: String
  var ref: String
  var repo: ReposListPullRequestsAssociatedWithCommitResponseItemHeadRepo
  var sha: String
  var user: ReposListPullRequestsAssociatedWithCommitResponseItemHeadUser
}

object ReposListPullRequestsAssociatedWithCommitResponseItemHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: ReposListPullRequestsAssociatedWithCommitResponseItemHeadRepo,
    sha: String,
    user: ReposListPullRequestsAssociatedWithCommitResponseItemHeadUser
  ): ReposListPullRequestsAssociatedWithCommitResponseItemHead = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemHead]
  }
}

