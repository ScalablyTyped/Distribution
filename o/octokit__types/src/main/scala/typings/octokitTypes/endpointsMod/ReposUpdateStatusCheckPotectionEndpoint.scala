package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateStatusCheckPotectionEndpoint extends StObject {
  
  var branch: String
  
  /**
    * The list of status checks to require in order to merge into this branch
    */
  var contexts: js.UndefOr[js.Array[String]] = js.undefined
  
  var owner: String
  
  var repo: String
  
  /**
    * Require branches to be up to date before merging.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object ReposUpdateStatusCheckPotectionEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposUpdateStatusCheckPotectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateStatusCheckPotectionEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateStatusCheckPotectionEndpointMutableBuilder[Self <: ReposUpdateStatusCheckPotectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
