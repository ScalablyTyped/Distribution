package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateResponseHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsUpdateResponseHeadRepo
  var sha: String
  var user: PullsUpdateResponseHeadUser
}

object PullsUpdateResponseHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsUpdateResponseHeadRepo,
    sha: String,
    user: PullsUpdateResponseHeadUser
  ): PullsUpdateResponseHead = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsUpdateResponseHead]
  }
}

