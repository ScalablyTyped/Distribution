package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponseBase extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsCreateResponseBaseRepo
  var sha: java.lang.String
  var user: PullsCreateResponseBaseUser
}

object PullsCreateResponseBase {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsCreateResponseBaseRepo,
    sha: java.lang.String,
    user: PullsCreateResponseBaseUser
  ): PullsCreateResponseBase = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateResponseBase]
  }
}

