package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateDeploymentEndpoint extends js.Object {
  
  /**
    * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
    */
  var auto_merge: js.UndefOr[Boolean] = js.native
  
  /**
    * Short description of the deployment.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
    */
  var environment: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  /**
    * JSON payload with extra information about the deployment.
    */
  var payload: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var production_environment: js.UndefOr[Boolean] = js.native
  
  /**
    * The ref to deploy. This can be a branch, tag, or SHA.
    */
  var ref: String = js.native
  
  var repo: String = js.native
  
  /**
    * The [status](https://developer.github.com/v3/repos/statuses/) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.
    */
  var required_contexts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var transient_environment: js.UndefOr[Boolean] = js.native
}
object ReposCreateDeploymentEndpoint {
  
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposCreateDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateDeploymentEndpointOps[Self <: ReposCreateDeploymentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_merge(value: Boolean): Self = this.set("auto_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_merge: Self = this.set("auto_merge", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setProduction_environment(value: Boolean): Self = this.set("production_environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduction_environment: Self = this.set("production_environment", js.undefined)
    
    @scala.inline
    def setRequired_contextsVarargs(value: String*): Self = this.set("required_contexts", js.Array(value :_*))
    
    @scala.inline
    def setRequired_contexts(value: js.Array[String]): Self = this.set("required_contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired_contexts: Self = this.set("required_contexts", js.undefined)
    
    @scala.inline
    def setTask(value: String): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
    
    @scala.inline
    def setTransient_environment(value: Boolean): Self = this.set("transient_environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransient_environment: Self = this.set("transient_environment", js.undefined)
  }
}
