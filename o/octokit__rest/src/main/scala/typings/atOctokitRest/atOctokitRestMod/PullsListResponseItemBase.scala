package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListResponseItemBase extends js.Object {
  var label: String
  var ref: String
  var repo: PullsListResponseItemBaseRepo
  var sha: String
  var user: PullsListResponseItemBaseUser
}

object PullsListResponseItemBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsListResponseItemBaseRepo,
    sha: String,
    user: PullsListResponseItemBaseUser
  ): PullsListResponseItemBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsListResponseItemBase]
  }
}

