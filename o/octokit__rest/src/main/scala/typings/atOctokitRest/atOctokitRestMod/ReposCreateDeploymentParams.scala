package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentParams extends js.Object {
  /**
    * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
    */
  var auto_merge: js.UndefOr[Boolean] = js.undefined
  /**
    * Short description of the deployment.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
    */
  var environment: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * JSON payload with extra information about the deployment.
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var production_environment: js.UndefOr[Boolean] = js.undefined
  /**
    * The ref to deploy. This can be a branch, tag, or SHA.
    */
  var ref: String
  var repo: String
  /**
    * The [status](https://developer.github.com/v3/repos/statuses/) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.
    */
  var required_contexts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[String] = js.undefined
  /**
    * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var transient_environment: js.UndefOr[Boolean] = js.undefined
}

object ReposCreateDeploymentParams {
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
  ): ReposCreateDeploymentParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_merge)) __obj.updateDynamic("auto_merge")(auto_merge.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(production_environment)) __obj.updateDynamic("production_environment")(production_environment.asInstanceOf[js.Any])
    if (required_contexts != null) __obj.updateDynamic("required_contexts")(required_contexts.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    if (!js.isUndefined(transient_environment)) __obj.updateDynamic("transient_environment")(transient_environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentParams]
  }
}

