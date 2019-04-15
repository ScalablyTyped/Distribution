package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitResponseItemBase extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: ReposListPullRequestsAssociatedWithCommitResponseItemBaseRepo
  var sha: java.lang.String
  var user: ReposListPullRequestsAssociatedWithCommitResponseItemBaseUser
}

object ReposListPullRequestsAssociatedWithCommitResponseItemBase {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: ReposListPullRequestsAssociatedWithCommitResponseItemBaseRepo,
    sha: java.lang.String,
    user: ReposListPullRequestsAssociatedWithCommitResponseItemBaseUser
  ): ReposListPullRequestsAssociatedWithCommitResponseItemBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemBase]
  }
}

