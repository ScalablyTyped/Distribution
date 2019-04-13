package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListResponseItemBase extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsListResponseItemBaseRepo
  var sha: java.lang.String
  var user: PullsListResponseItemBaseUser
}

object PullsListResponseItemBase {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsListResponseItemBaseRepo,
    sha: java.lang.String,
    user: PullsListResponseItemBaseUser
  ): PullsListResponseItemBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsListResponseItemBase]
  }
}

