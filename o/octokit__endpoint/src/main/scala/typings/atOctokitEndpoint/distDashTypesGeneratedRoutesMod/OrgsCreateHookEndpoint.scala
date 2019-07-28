package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateHookEndpoint extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var config: js.Object
  var `config.content_type`: js.UndefOr[String] = js.undefined
  var `config.insecure_ssl`: js.UndefOr[String] = js.undefined
  var `config.secret`: js.UndefOr[String] = js.undefined
  var `config.url`: String
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var org: String
}

object OrgsCreateHookEndpoint {
  @scala.inline
  def apply(
    config: js.Object,
    `config.url`: String,
    name: String,
    org: String,
    active: js.UndefOr[Boolean] = js.undefined,
    `config.content_type`: String = null,
    `config.insecure_ssl`: String = null,
    `config.secret`: String = null,
    events: js.Array[String] = null
  ): OrgsCreateHookEndpoint = {
    val __obj = js.Dynamic.literal(config = config, name = name, org = org)
    __obj.updateDynamic("config.url")(`config.url`)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (`config.content_type` != null) __obj.updateDynamic("config.content_type")(`config.content_type`)
    if (`config.insecure_ssl` != null) __obj.updateDynamic("config.insecure_ssl")(`config.insecure_ssl`)
    if (`config.secret` != null) __obj.updateDynamic("config.secret")(`config.secret`)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[OrgsCreateHookEndpoint]
  }
}

