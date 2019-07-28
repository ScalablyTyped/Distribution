package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetResponseBase extends js.Object {
  var label: String
  var ref: String
  var repo: PullsGetResponseBaseRepo
  var sha: String
  var user: PullsGetResponseBaseUser
}

object PullsGetResponseBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsGetResponseBaseRepo,
    sha: String,
    user: PullsGetResponseBaseUser
  ): PullsGetResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsGetResponseBase]
  }
}

