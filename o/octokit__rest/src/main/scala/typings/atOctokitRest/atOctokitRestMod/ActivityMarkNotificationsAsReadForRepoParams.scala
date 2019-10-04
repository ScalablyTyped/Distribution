package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkNotificationsAsReadForRepoParams extends js.Object {
  /**
    * Describes the last point that notifications were checked. Anything updated since this time will not be updated. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
    */
  var last_read_at: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ActivityMarkNotificationsAsReadForRepoParams {
  @scala.inline
  def apply(owner: String, repo: String, last_read_at: String = null): ActivityMarkNotificationsAsReadForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (last_read_at != null) __obj.updateDynamic("last_read_at")(last_read_at)
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadForRepoParams]
  }
}

