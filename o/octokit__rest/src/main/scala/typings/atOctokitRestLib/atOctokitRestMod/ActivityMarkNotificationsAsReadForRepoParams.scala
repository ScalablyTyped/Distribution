package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkNotificationsAsReadForRepoParams extends js.Object {
  /**
    * Describes the last point that notifications were checked. Anything updated since this time will not be updated. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var last_read_at: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ActivityMarkNotificationsAsReadForRepoParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, last_read_at: java.lang.String = null): ActivityMarkNotificationsAsReadForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (last_read_at != null) __obj.updateDynamic("last_read_at")(last_read_at)
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadForRepoParams]
  }
}

