package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentStatus_Options extends js.Object {
  var auto_inactive: js.UndefOr[scala.Boolean] = js.undefined
  var deployment_id: scala.Double
  var description: js.UndefOr[java.lang.String] = js.undefined
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var environment_url: js.UndefOr[java.lang.String] = js.undefined
  var log_url: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var state: java.lang.String
  var target_url: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateDeploymentStatus_Options {
  @scala.inline
  def apply(
    deployment_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    state: java.lang.String,
    auto_inactive: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    environment: java.lang.String = null,
    environment_url: java.lang.String = null,
    log_url: java.lang.String = null,
    target_url: java.lang.String = null
  ): ReposCreateDeploymentStatus_Options = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo, state = state)
    if (!js.isUndefined(auto_inactive)) __obj.updateDynamic("auto_inactive")(auto_inactive)
    if (description != null) __obj.updateDynamic("description")(description)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (environment_url != null) __obj.updateDynamic("environment_url")(environment_url)
    if (log_url != null) __obj.updateDynamic("log_url")(log_url)
    if (target_url != null) __obj.updateDynamic("target_url")(target_url)
    __obj.asInstanceOf[ReposCreateDeploymentStatus_Options]
  }
}

