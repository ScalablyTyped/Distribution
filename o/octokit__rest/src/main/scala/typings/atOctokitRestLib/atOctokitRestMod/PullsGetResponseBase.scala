package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetResponseBase extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsGetResponseBaseRepo
  var sha: java.lang.String
  var user: PullsGetResponseBaseUser
}

object PullsGetResponseBase {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsGetResponseBaseRepo,
    sha: java.lang.String,
    user: PullsGetResponseBaseUser
  ): PullsGetResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsGetResponseBase]
  }
}

