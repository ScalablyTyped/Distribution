package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetAppsWithAccessToProtectedBranchEndpoint extends StObject {
  
  var branch: String
  
  var owner: String
  
  var repo: String
}
object ReposGetAppsWithAccessToProtectedBranchEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposGetAppsWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAppsWithAccessToProtectedBranchEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetAppsWithAccessToProtectedBranchEndpointMutableBuilder[Self <: ReposGetAppsWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
