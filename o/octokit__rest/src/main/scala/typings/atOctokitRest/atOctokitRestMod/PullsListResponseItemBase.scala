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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsListResponseItemBase]
  }
}

