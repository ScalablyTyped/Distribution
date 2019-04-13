package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListResponseItemHead extends js.Object {
  var label: java.lang.String
  var ref: java.lang.String
  var repo: PullsListResponseItemHeadRepo
  var sha: java.lang.String
  var user: PullsListResponseItemHeadUser
}

object PullsListResponseItemHead {
  @scala.inline
  def apply(
    label: java.lang.String,
    ref: java.lang.String,
    repo: PullsListResponseItemHeadRepo,
    sha: java.lang.String,
    user: PullsListResponseItemHeadUser
  ): PullsListResponseItemHead = {
    val __obj = js.Dynamic.literal(label = label, ref = ref, repo = repo, sha = sha, user = user)
  
    __obj.asInstanceOf[PullsListResponseItemHead]
  }
}

