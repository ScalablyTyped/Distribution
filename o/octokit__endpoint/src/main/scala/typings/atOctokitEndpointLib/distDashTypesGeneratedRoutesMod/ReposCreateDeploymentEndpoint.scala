package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentEndpoint extends js.Object {
  var auto_merge: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var production_environment: js.UndefOr[scala.Boolean] = js.undefined
  var ref: java.lang.String
  var repo: java.lang.String
  var required_contexts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var task: js.UndefOr[java.lang.String] = js.undefined
  var transient_environment: js.UndefOr[scala.Boolean] = js.undefined
}

object ReposCreateDeploymentEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    auto_merge: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    environment: java.lang.String = null,
    payload: java.lang.String = null,
    production_environment: js.UndefOr[scala.Boolean] = js.undefined,
    required_contexts: js.Array[java.lang.String] = null,
    task: java.lang.String = null,
    transient_environment: js.UndefOr[scala.Boolean] = js.undefined
  ): ReposCreateDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (!js.isUndefined(auto_merge)) __obj.updateDynamic("auto_merge")(auto_merge)
    if (description != null) __obj.updateDynamic("description")(description)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(production_environment)) __obj.updateDynamic("production_environment")(production_environment)
    if (required_contexts != null) __obj.updateDynamic("required_contexts")(required_contexts)
    if (task != null) __obj.updateDynamic("task")(task)
    if (!js.isUndefined(transient_environment)) __obj.updateDynamic("transient_environment")(transient_environment)
    __obj.asInstanceOf[ReposCreateDeploymentEndpoint]
  }
}

