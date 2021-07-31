package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateForkEndpoint extends StObject {
  
  /**
    * Optional parameter to specify the organization name if forking into an organization.
    */
  var organization: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  var repo: String
}
object ReposCreateForkEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateForkEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateForkEndpointMutableBuilder[Self <: ReposCreateForkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
