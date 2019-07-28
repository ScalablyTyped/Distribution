package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateResponseBase extends js.Object {
  var label: String
  var ref: String
  var repo: PullsUpdateResponseBaseRepo
  var sha: String
  var user: PullsUpdateResponseBaseUser
}

object PullsUpdateResponseBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsUpdateResponseBaseRepo,
    sha: String,
    user: PullsUpdateResponseBaseUser
  ): PullsUpdateResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsUpdateResponseBase]
  }
}

