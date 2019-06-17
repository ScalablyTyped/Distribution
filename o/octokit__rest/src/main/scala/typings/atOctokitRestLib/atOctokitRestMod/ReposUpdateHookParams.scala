package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateHookParams extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines a list of events to be added to the list of events that the Hook triggers for.
    */
  var add_events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/repos/hooks/#create-hook-config-params).
    */
  var config: js.UndefOr[ReposUpdateHookParamsConfig] = js.undefined
  /**
    * Determines what [events](https://developer.github.com/v3/activity/events/types/) the hook is triggered for. This replaces the entire array of events.
    */
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hook_id: scala.Double
  var owner: java.lang.String
  /**
    * Determines a list of events to be removed from the list of events that the Hook triggers for.
    */
  var remove_events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var repo: java.lang.String
}

object ReposUpdateHookParams {
  @scala.inline
  def apply(
    hook_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    add_events: js.Array[java.lang.String] = null,
    config: ReposUpdateHookParamsConfig = null,
    events: js.Array[java.lang.String] = null,
    remove_events: js.Array[java.lang.String] = null
  ): ReposUpdateHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, owner = owner, repo = repo)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (add_events != null) __obj.updateDynamic("add_events")(add_events)
    if (config != null) __obj.updateDynamic("config")(config)
    if (events != null) __obj.updateDynamic("events")(events)
    if (remove_events != null) __obj.updateDynamic("remove_events")(remove_events)
    __obj.asInstanceOf[ReposUpdateHookParams]
  }
}

