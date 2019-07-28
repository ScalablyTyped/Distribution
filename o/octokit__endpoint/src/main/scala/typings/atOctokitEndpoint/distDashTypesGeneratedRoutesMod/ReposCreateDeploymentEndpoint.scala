package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentEndpoint extends js.Object {
  var auto_merge: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var environment: js.UndefOr[String] = js.undefined
  var owner: String
  var payload: js.UndefOr[String] = js.undefined
  var production_environment: js.UndefOr[Boolean] = js.undefined
  var ref: String
  var repo: String
  var required_contexts: js.UndefOr[js.Array[String]] = js.undefined
  var task: js.UndefOr[String] = js.undefined
  var transient_environment: js.UndefOr[Boolean] = js.undefined
}

object ReposCreateDeploymentEndpoint {
  @scala.inline
  def apply(
    owner: String,
    ref: String,
    repo: String,
    auto_merge: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    environment: String = null,
    payload: String = null,
    production_environment: js.UndefOr[Boolean] = js.undefined,
    required_contexts: js.Array[String] = null,
    task: String = null,
    transient_environment: js.UndefOr[Boolean] = js.undefined
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

