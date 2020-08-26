package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.error
import typings.octokitTypes.octokitTypesStrings.failure
import typings.octokitTypes.octokitTypesStrings.in_progress
import typings.octokitTypes.octokitTypesStrings.inactive
import typings.octokitTypes.octokitTypesStrings.pending
import typings.octokitTypes.octokitTypesStrings.production
import typings.octokitTypes.octokitTypesStrings.qa
import typings.octokitTypes.octokitTypesStrings.queued
import typings.octokitTypes.octokitTypesStrings.staging
import typings.octokitTypes.octokitTypesStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateDeploymentStatusEndpoint extends js.Object {
  /**
    * Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same repository and `environment` name as the created status's deployment. An `inactive` status is only added to deployments that had a `success` state. Default: `true`
    * **Note:** To add an `inactive` status to `production` environments, you must use the [`application/vnd.github.flash-preview+json`](https://developer.github.com/v3/previews/#deployment-statuses) custom media type.
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var auto_inactive: js.UndefOr[Boolean] = js.native
  var deployment_id: Double = js.native
  /**
    * A short description of the status. The maximum description length is 140 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Name for the target deployment environment, which can be changed when setting a deploy status. For example, `production`, `staging`, or `qa`. **Note:** This parameter requires you to use the [`application/vnd.github.flash-preview+json`](https://developer.github.com/v3/previews/#deployment-statuses) custom media type.
    */
  var environment: js.UndefOr[production | staging | qa] = js.native
  /**
    * Sets the URL for accessing your environment. Default: `""`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var environment_url: js.UndefOr[String] = js.native
  /**
    * The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url` will automatically set `target_url` to the same value. Default: `""`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var log_url: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The state of the status. Can be one of `error`, `failure`, `inactive`, `in_progress`, `queued` `pending`, or `success`. **Note:** To use the `inactive` state, you must provide the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. To use the `in_progress` and `queued` states, you must provide the [`application/vnd.github.flash-preview+json`](https://developer.github.com/v3/previews/#deployment-statuses) custom media type. When you set a transient deployment to `inactive`, the deployment will be shown as `destroyed` in GitHub.
    */
  var state: error | failure | inactive | in_progress | queued | pending | success = js.native
  /**
    * The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment. **Note:** It's recommended to use the `log_url` parameter, which replaces `target_url`.
    */
  var target_url: js.UndefOr[String] = js.native
}

object ReposCreateDeploymentStatusEndpoint {
  @scala.inline
  def apply(
    deployment_id: Double,
    owner: String,
    repo: String,
    state: error | failure | inactive | in_progress | queued | pending | success
  ): ReposCreateDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentStatusEndpoint]
  }
  @scala.inline
  implicit class ReposCreateDeploymentStatusEndpointOps[Self <: ReposCreateDeploymentStatusEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeployment_id(value: Double): Self = this.set("deployment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: error | failure | inactive | in_progress | queued | pending | success): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuto_inactive(value: Boolean): Self = this.set("auto_inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_inactive: Self = this.set("auto_inactive", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnvironment(value: production | staging | qa): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setEnvironment_url(value: String): Self = this.set("environment_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment_url: Self = this.set("environment_url", js.undefined)
    @scala.inline
    def setLog_url(value: String): Self = this.set("log_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog_url: Self = this.set("log_url", js.undefined)
    @scala.inline
    def setTarget_url(value: String): Self = this.set("target_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget_url: Self = this.set("target_url", js.undefined)
  }
  
}

