package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitResponseItemBase extends js.Object {
  var label: String
  var ref: String
  var repo: ReposListPullRequestsAssociatedWithCommitResponseItemBaseRepo
  var sha: String
  var user: ReposListPullRequestsAssociatedWithCommitResponseItemBaseUser
}

object ReposListPullRequestsAssociatedWithCommitResponseItemBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: ReposListPullRequestsAssociatedWithCommitResponseItemBaseRepo,
    sha: String,
    user: ReposListPullRequestsAssociatedWithCommitResponseItemBaseUser
  ): ReposListPullRequestsAssociatedWithCommitResponseItemBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemBase]
  }
}

