package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateHookParams extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/orgs/hooks/#create-hook-config-params).
    */
  var config: OrgsCreateHookParamsConfig
  /**
    * Determines what [events](https://developer.github.com/v3/activity/events/types/) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Must be passed as "web".
    */
  var name: java.lang.String
  var org: java.lang.String
}

object OrgsCreateHookParams {
  @scala.inline
  def apply(
    config: OrgsCreateHookParamsConfig,
    name: java.lang.String,
    org: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    events: js.Array[java.lang.String] = null
  ): OrgsCreateHookParams = {
    val __obj = js.Dynamic.literal(config = config, name = name, org = org)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[OrgsCreateHookParams]
  }
}

