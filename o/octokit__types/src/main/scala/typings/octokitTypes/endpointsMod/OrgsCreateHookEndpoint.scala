package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateHookEndpoint extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/orgs/hooks/#create-hook-config-params).
    */
  var config: OrgsCreateHookParamsConfig
  /**
    * Determines what [events](https://developer.github.com/webhooks/event-payloads) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Must be passed as "web".
    */
  var name: String
  @JSName("org")
  var org_ : String
}

object OrgsCreateHookEndpoint {
  @scala.inline
  def apply(
    config: OrgsCreateHookParamsConfig,
    name: String,
    org_ : String,
    active: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[String] = null
  ): OrgsCreateHookEndpoint = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateHookEndpoint]
  }
}

