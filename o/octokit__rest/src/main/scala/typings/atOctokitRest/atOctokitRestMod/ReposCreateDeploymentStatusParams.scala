package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.error
import typings.atOctokitRest.atOctokitRestStrings.failure
import typings.atOctokitRest.atOctokitRestStrings.in_progress
import typings.atOctokitRest.atOctokitRestStrings.inactive
import typings.atOctokitRest.atOctokitRestStrings.pending
import typings.atOctokitRest.atOctokitRestStrings.production
import typings.atOctokitRest.atOctokitRestStrings.qa
import typings.atOctokitRest.atOctokitRestStrings.queued
import typings.atOctokitRest.atOctokitRestStrings.staging
import typings.atOctokitRest.atOctokitRestStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDeploymentStatusParams extends js.Object {
  /**
    * Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same repository and `environment` name as the created status's deployment. An `inactive` status is only added to deployments that had a `success` state. Default: `true`
    * **Note:** To add an `inactive` status to `production` environments, you must use the [`application/vnd.github.flash-preview+json`](https://developer.github.com/v3/previews/#deployment-statuses) custom media type.
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** To add an `inactive` status to `production` environments, you must use the [`application/vnd.github.flash-preview+json`](https://developer.github.com/v3/previews/#deployment-statuses) custom media type.
    */
  var auto_inactive: js.UndefOr[Boolean] = js.undefined
  var deployment_id: Double
  /**
    * A short description of the status. The maximum description length is 140 characters.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Name for the target deployment environment, which can be changed when setting a deploy status. For example, `production`, `staging`, or `qa`. **Note:** This parameter requires you to use the [`application/vnd.github.flash-preview+json`](https://developer.github.com/v3/previews/#deployment-statuses) custom media type.
    */
  var environment: js.UndefOr[production | staging | qa] = js.undefined
  /**
    * Sets the URL for accessing your environment. Default: `""`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var environment_url: js.UndefOr[String] = js.undefined
  /**
    * The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url` will automatically set `target_url` to the same value. Default: `""`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var log_url: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  /**
    * The state of the status. Can be one of `error`, `failure`, `inactive`, `in_progress`, `queued` `pending`, or `success`. **Note:** To use the `inactive` state, you must provide the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. To use the `in_progress` and `queued` states, you must provide the [`application/vnd.github.flash-preview+json`](https://developer.github.com/v3/previews/#deployment-statuses) custom media type.
    */
  var state: error | failure | inactive | in_progress | queued | pending | success
  /**
    * The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment. **Note:** It's recommended to use the `log_url` parameter, which replaces `target_url`.
    */
  var target_url: js.UndefOr[String] = js.undefined
}

object ReposCreateDeploymentStatusParams {
  @scala.inline
  def apply(
    deployment_id: Double,
    owner: String,
    repo: String,
    state: error | failure | inactive | in_progress | queued | pending | success,
    auto_inactive: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    environment: production | staging | qa = null,
    environment_url: String = null,
    log_url: String = null,
    target_url: String = null
  ): ReposCreateDeploymentStatusParams = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo, state = state.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_inactive)) __obj.updateDynamic("auto_inactive")(auto_inactive)
    if (description != null) __obj.updateDynamic("description")(description)
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (environment_url != null) __obj.updateDynamic("environment_url")(environment_url)
    if (log_url != null) __obj.updateDynamic("log_url")(log_url)
    if (target_url != null) __obj.updateDynamic("target_url")(target_url)
    __obj.asInstanceOf[ReposCreateDeploymentStatusParams]
  }
}

