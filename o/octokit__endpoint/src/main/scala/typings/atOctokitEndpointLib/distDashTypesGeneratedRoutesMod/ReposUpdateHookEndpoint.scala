package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateHookEndpoint extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var add_events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var config: js.UndefOr[js.Object] = js.undefined
  var `config.content_type`: js.UndefOr[java.lang.String] = js.undefined
  var `config.insecure_ssl`: js.UndefOr[java.lang.String] = js.undefined
  var `config.secret`: js.UndefOr[java.lang.String] = js.undefined
  var `config.url`: java.lang.String
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hook_id: scala.Double
  var owner: java.lang.String
  var remove_events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var repo: java.lang.String
}

object ReposUpdateHookEndpoint {
  @scala.inline
  def apply(
    `config.url`: java.lang.String,
    hook_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    add_events: js.Array[java.lang.String] = null,
    config: js.Object = null,
    `config.content_type`: java.lang.String = null,
    `config.insecure_ssl`: java.lang.String = null,
    `config.secret`: java.lang.String = null,
    events: js.Array[java.lang.String] = null,
    remove_events: js.Array[java.lang.String] = null
  ): ReposUpdateHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, owner = owner, repo = repo)
    __obj.updateDynamic("config.url")(`config.url`)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (add_events != null) __obj.updateDynamic("add_events")(add_events)
    if (config != null) __obj.updateDynamic("config")(config)
    if (`config.content_type` != null) __obj.updateDynamic("config.content_type")(`config.content_type`)
    if (`config.insecure_ssl` != null) __obj.updateDynamic("config.insecure_ssl")(`config.insecure_ssl`)
    if (`config.secret` != null) __obj.updateDynamic("config.secret")(`config.secret`)
    if (events != null) __obj.updateDynamic("events")(events)
    if (remove_events != null) __obj.updateDynamic("remove_events")(remove_events)
    __obj.asInstanceOf[ReposUpdateHookEndpoint]
  }
}

