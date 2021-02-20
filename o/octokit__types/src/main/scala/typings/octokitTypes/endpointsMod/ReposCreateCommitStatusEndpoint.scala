package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.error
import typings.octokitTypes.octokitTypesStrings.failure
import typings.octokitTypes.octokitTypesStrings.pending
import typings.octokitTypes.octokitTypesStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateCommitStatusEndpoint extends StObject {
  
  /**
    * A string label to differentiate this status from the status of other systems.
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * A short description of the status.
    */
  var description: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var sha: String = js.native
  
  /**
    * The state of the status. Can be one of `error`, `failure`, `pending`, or `success`.
    */
  var state: error | failure | pending | success = js.native
  
  /**
    * The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.
    * For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:
    * `http://ci.example.com/user/repo/build/sha`
    */
  var target_url: js.UndefOr[String] = js.native
}
object ReposCreateCommitStatusEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, sha: String, state: error | failure | pending | success): ReposCreateCommitStatusEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitStatusEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateCommitStatusEndpointMutableBuilder[Self <: ReposCreateCommitStatusEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: error | failure | pending | success): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_urlUndefined: Self = StObject.set(x, "target_url", js.undefined)
  }
}
