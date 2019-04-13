package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookParams extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](#create-hook-config-params).
    */
  var config: ReposCreateHookParamsConfig
  /**
    * Determines what [events](https://developer.github.com/v3/activity/events/types/) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Use `web` to create a webhook. This parameter only accepts the value `web`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposCreateHookParams {
  @scala.inline
  def apply(
    config: ReposCreateHookParamsConfig,
    owner: java.lang.String,
    repo: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    events: js.Array[java.lang.String] = null,
    name: java.lang.String = null
  ): ReposCreateHookParams = {
    val __obj = js.Dynamic.literal(config = config, owner = owner, repo = repo)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (events != null) __obj.updateDynamic("events")(events)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReposCreateHookParams]
  }
}

