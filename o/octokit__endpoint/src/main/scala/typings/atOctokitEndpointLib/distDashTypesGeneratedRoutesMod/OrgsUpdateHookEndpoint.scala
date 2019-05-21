package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateHookEndpoint extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var config: js.UndefOr[js.Object] = js.undefined
  var `config.content_type`: js.UndefOr[java.lang.String] = js.undefined
  var `config.insecure_ssl`: js.UndefOr[java.lang.String] = js.undefined
  var `config.secret`: js.UndefOr[java.lang.String] = js.undefined
  var `config.url`: java.lang.String
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hook_id: scala.Double
  var org: java.lang.String
}

object OrgsUpdateHookEndpoint {
  @scala.inline
  def apply(
    `config.url`: java.lang.String,
    hook_id: scala.Double,
    org: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Object = null,
    `config.content_type`: java.lang.String = null,
    `config.insecure_ssl`: java.lang.String = null,
    `config.secret`: java.lang.String = null,
    events: js.Array[java.lang.String] = null
  ): OrgsUpdateHookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, org = org)
    __obj.updateDynamic("config.url")(`config.url`)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (config != null) __obj.updateDynamic("config")(config)
    if (`config.content_type` != null) __obj.updateDynamic("config.content_type")(`config.content_type`)
    if (`config.insecure_ssl` != null) __obj.updateDynamic("config.insecure_ssl")(`config.insecure_ssl`)
    if (`config.secret` != null) __obj.updateDynamic("config.secret")(`config.secret`)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[OrgsUpdateHookEndpoint]
  }
}

