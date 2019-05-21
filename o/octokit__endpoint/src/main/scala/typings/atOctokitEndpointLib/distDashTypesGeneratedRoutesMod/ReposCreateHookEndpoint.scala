package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookEndpoint extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var config: js.Object
  var `config.content_type`: js.UndefOr[java.lang.String] = js.undefined
  var `config.insecure_ssl`: js.UndefOr[java.lang.String] = js.undefined
  var `config.secret`: js.UndefOr[java.lang.String] = js.undefined
  var `config.url`: java.lang.String
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposCreateHookEndpoint {
  @scala.inline
  def apply(
    config: js.Object,
    `config.url`: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    `config.content_type`: java.lang.String = null,
    `config.insecure_ssl`: java.lang.String = null,
    `config.secret`: java.lang.String = null,
    events: js.Array[java.lang.String] = null,
    name: java.lang.String = null
  ): ReposCreateHookEndpoint = {
    val __obj = js.Dynamic.literal(config = config, owner = owner, repo = repo)
    __obj.updateDynamic("config.url")(`config.url`)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (`config.content_type` != null) __obj.updateDynamic("config.content_type")(`config.content_type`)
    if (`config.insecure_ssl` != null) __obj.updateDynamic("config.insecure_ssl")(`config.insecure_ssl`)
    if (`config.secret` != null) __obj.updateDynamic("config.secret")(`config.secret`)
    if (events != null) __obj.updateDynamic("events")(events)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReposCreateHookEndpoint]
  }
}

