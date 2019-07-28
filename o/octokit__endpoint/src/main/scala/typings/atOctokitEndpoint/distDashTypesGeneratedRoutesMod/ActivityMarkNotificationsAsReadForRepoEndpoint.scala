package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkNotificationsAsReadForRepoEndpoint extends js.Object {
  var last_read_at: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ActivityMarkNotificationsAsReadForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, last_read_at: String = null): ActivityMarkNotificationsAsReadForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (last_read_at != null) __obj.updateDynamic("last_read_at")(last_read_at)
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadForRepoEndpoint]
  }
}

