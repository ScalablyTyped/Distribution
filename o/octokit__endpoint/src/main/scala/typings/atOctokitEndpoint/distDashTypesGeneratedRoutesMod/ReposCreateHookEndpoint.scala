package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookEndpoint extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var config: js.Object
  var `config.content_type`: js.UndefOr[String] = js.undefined
  var `config.insecure_ssl`: js.UndefOr[String] = js.undefined
  var `config.secret`: js.UndefOr[String] = js.undefined
  var `config.url`: String
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposCreateHookEndpoint {
  @scala.inline
  def apply(
    config: js.Object,
    `config.url`: String,
    owner: String,
    repo: String,
    active: js.UndefOr[Boolean] = js.undefined,
    `config.content_type`: String = null,
    `config.insecure_ssl`: String = null,
    `config.secret`: String = null,
    events: js.Array[String] = null,
    name: String = null
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

