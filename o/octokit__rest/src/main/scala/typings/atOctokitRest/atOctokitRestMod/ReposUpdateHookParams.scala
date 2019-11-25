package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateHookParams extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines a list of events to be added to the list of events that the Hook triggers for.
    */
  var add_events: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/repos/hooks/#create-hook-config-params).
    */
  var config: js.UndefOr[ReposUpdateHookParamsConfig] = js.undefined
  /**
    * Determines what [events](https://developer.github.com/v3/activity/events/types/) the hook is triggered for. This replaces the entire array of events.
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var hook_id: Double
  var owner: String
  /**
    * Determines a list of events to be removed from the list of events that the Hook triggers for.
    */
  var remove_events: js.UndefOr[js.Array[String]] = js.undefined
  var repo: String
}

object ReposUpdateHookParams {
  @scala.inline
  def apply(
    hook_id: Double,
    owner: String,
    repo: String,
    active: js.UndefOr[Boolean] = js.undefined,
    add_events: js.Array[String] = null,
    config: ReposUpdateHookParamsConfig = null,
    events: js.Array[String] = null,
    remove_events: js.Array[String] = null
  ): ReposUpdateHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (add_events != null) __obj.updateDynamic("add_events")(add_events.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (remove_events != null) __obj.updateDynamic("remove_events")(remove_events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateHookParams]
  }
}

