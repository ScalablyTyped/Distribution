package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentParams extends js.Object {
  /**
    * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
    */
  var auto_merge: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Short description of the deployment.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
    */
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  /**
    * JSON payload with extra information about the deployment.
    */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.  ,* **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var production_environment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ref to deploy. This can be a branch, tag, or SHA.
    */
  var ref: java.lang.String
  var repo: java.lang.String
  /**
    * The [status](https://developer.github.com/v3/repos/statuses/) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.
    */
  var required_contexts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`  ,* **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var transient_environment: js.UndefOr[scala.Boolean] = js.undefined
}

object ReposCreateDeploymentParams {
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
  ): ReposCreateDeploymentParams = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (!js.isUndefined(auto_merge)) __obj.updateDynamic("auto_merge")(auto_merge)
    if (description != null) __obj.updateDynamic("description")(description)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(production_environment)) __obj.updateDynamic("production_environment")(production_environment)
    if (required_contexts != null) __obj.updateDynamic("required_contexts")(required_contexts)
    if (task != null) __obj.updateDynamic("task")(task)
    if (!js.isUndefined(transient_environment)) __obj.updateDynamic("transient_environment")(transient_environment)
    __obj.asInstanceOf[ReposCreateDeploymentParams]
  }
}

