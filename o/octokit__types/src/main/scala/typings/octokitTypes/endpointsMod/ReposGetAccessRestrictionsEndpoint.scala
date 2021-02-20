package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetAccessRestrictionsEndpoint extends StObject {
  
  var branch: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposGetAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposGetAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetAccessRestrictionsEndpointMutableBuilder[Self <: ReposGetAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
