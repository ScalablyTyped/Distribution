package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetResponseHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsGetResponseHeadRepo
  var sha: String
  var user: PullsGetResponseHeadUser
}

object PullsGetResponseHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsGetResponseHeadRepo,
    sha: String,
    user: PullsGetResponseHeadUser
  ): PullsGetResponseHead = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsGetResponseHead]
  }
}

