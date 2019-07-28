package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentStatusEndpoint extends js.Object {
  var auto_inactive: js.UndefOr[Boolean] = js.undefined
  var deployment_id: Double
  var description: js.UndefOr[String] = js.undefined
  var environment: js.UndefOr[String] = js.undefined
  var environment_url: js.UndefOr[String] = js.undefined
  var log_url: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var state: String
  var target_url: js.UndefOr[String] = js.undefined
}

object ReposCreateDeploymentStatusEndpoint {
  @scala.inline
  def apply(
    deployment_id: Double,
    owner: String,
    repo: String,
    state: String,
    auto_inactive: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    environment: String = null,
    environment_url: String = null,
    log_url: String = null,
    target_url: String = null
  ): ReposCreateDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo, state = state)
    if (!js.isUndefined(auto_inactive)) __obj.updateDynamic("auto_inactive")(auto_inactive)
    if (description != null) __obj.updateDynamic("description")(description)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (environment_url != null) __obj.updateDynamic("environment_url")(environment_url)
    if (log_url != null) __obj.updateDynamic("log_url")(log_url)
    if (target_url != null) __obj.updateDynamic("target_url")(target_url)
    __obj.asInstanceOf[ReposCreateDeploymentStatusEndpoint]
  }
}

