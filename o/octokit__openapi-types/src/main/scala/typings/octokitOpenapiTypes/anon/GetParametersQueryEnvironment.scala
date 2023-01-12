package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryEnvironment extends StObject {
  
  /** Simple filtering of deployments is available via query parameters: */
  var get: ParametersQueryEnvironment
  
  /**
    * Deployments offer a few configurable parameters with certain defaults.
    *
    * The `ref` parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them
    * before we merge a pull request.
    *
    * The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have
    * multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter
    * makes it easier to track which environments have requested deployments. The default environment is `production`.
    *
    * The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If
    * the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds,
    * the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will
    * return a failure response.
    *
    * By default, [commit statuses](https://docs.github.com/rest/commits/statuses) for every submitted context must be in a `success`
    * state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to
    * specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do
    * not require any contexts or create any commit statuses, the deployment will always succeed.
    *
    * The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text
    * field that will be passed on when a deployment event is dispatched.
    *
    * The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might
    * be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an
    * application with debugging enabled.
    *
    * Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref.
    *
    * #### Merged branch response
    * You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating
    * a deployment. This auto-merge happens when:
    * *   Auto-merge option is enabled in the repository
    * *   Topic branch does not include the latest changes on the base branch, which is `master` in the response example
    * *   There are no merge conflicts
    *
    * If there are no new commits in the base branch, a new request to create a deployment should give a successful
    * response.
    *
    * #### Merge conflict response
    * This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't
    * be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.
    *
    * #### Failed commit status checks
    * This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success`
    * status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.
    */
  var post: RequestBodyContentApplicationjsonAutomerge
}
object GetParametersQueryEnvironment {
  
  inline def apply(get: ParametersQueryEnvironment, post: RequestBodyContentApplicationjsonAutomerge): GetParametersQueryEnvironment = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryEnvironment] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryEnvironment): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAutomerge): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
