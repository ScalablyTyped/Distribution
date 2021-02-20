package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetUsersWithAccessToProtectedBranchEndpoint extends StObject {
  
  var branch: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposGetUsersWithAccessToProtectedBranchEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposGetUsersWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetUsersWithAccessToProtectedBranchEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetUsersWithAccessToProtectedBranchEndpointMutableBuilder[Self <: ReposGetUsersWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
