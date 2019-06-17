package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateHookParams extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/orgs/hooks/#update-hook-config-params).
    */
  var config: js.UndefOr[OrgsUpdateHookParamsConfig] = js.undefined
  /**
    * Determines what [events](https://developer.github.com/v3/activity/events/types/) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hook_id: scala.Double
  var org: java.lang.String
}

object OrgsUpdateHookParams {
  @scala.inline
  def apply(
    hook_id: scala.Double,
    org: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    config: OrgsUpdateHookParamsConfig = null,
    events: js.Array[java.lang.String] = null
  ): OrgsUpdateHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, org = org)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (config != null) __obj.updateDynamic("config")(config)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[OrgsUpdateHookParams]
  }
}

