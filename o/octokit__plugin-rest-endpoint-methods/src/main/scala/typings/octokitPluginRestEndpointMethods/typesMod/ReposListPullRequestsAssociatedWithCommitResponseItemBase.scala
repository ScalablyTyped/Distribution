package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemBase]
  }
}

