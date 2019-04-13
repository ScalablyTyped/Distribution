package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponseHead extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsCreateResponseHeadRepo
  var sha: java.lang.String
  var user: PullsCreateResponseHeadUser
}

object PullsCreateResponseHead {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsCreateResponseHeadRepo,
    sha: java.lang.String,
    user: PullsCreateResponseHeadUser
  ): PullsCreateResponseHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsCreateResponseHead]
  }
}

