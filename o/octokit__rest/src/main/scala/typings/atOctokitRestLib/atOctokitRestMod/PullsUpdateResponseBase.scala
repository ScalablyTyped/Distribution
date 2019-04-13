package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateResponseBase extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsUpdateResponseBaseRepo
  var sha: java.lang.String
  var user: PullsUpdateResponseBaseUser
}

object PullsUpdateResponseBase {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsUpdateResponseBaseRepo,
    sha: java.lang.String,
    user: PullsUpdateResponseBaseUser
  ): PullsUpdateResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsUpdateResponseBase]
  }
}

