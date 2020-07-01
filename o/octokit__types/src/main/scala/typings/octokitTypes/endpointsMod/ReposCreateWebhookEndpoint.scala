package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateWebhookEndpoint extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/repos/hooks/#create-hook-config-params).
    */
  var config: ReposCreateWebhookParamsConfig
  /**
    * Determines what [events](https://developer.github.com/webhooks/event-payloads) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Use `web` to create a webhook. Default: `web`. This parameter only accepts the value `web`.
    */
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposCreateWebhookEndpoint {
  @scala.inline
  def apply(
    config: ReposCreateWebhookParamsConfig,
    owner: String,
    repo: String,
    active: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[String] = null,
    name: String = null
  ): ReposCreateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateWebhookEndpoint]
  }
}

