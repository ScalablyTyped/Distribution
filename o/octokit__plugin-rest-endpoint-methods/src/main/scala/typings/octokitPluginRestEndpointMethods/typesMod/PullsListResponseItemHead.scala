package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListResponseItemHead extends js.Object {
  var label: String
  var ref: String
  var repo: PullsListResponseItemHeadRepo
  var sha: String
  var user: PullsListResponseItemHeadUser
}

object PullsListResponseItemHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsListResponseItemHeadRepo,
    sha: String,
    user: PullsListResponseItemHeadUser
  ): PullsListResponseItemHead = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListResponseItemHead]
  }
}

