package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteDeploymentEndpoint extends StObject {
  
  var deployment_id: Double
  
  var owner: String
  
  var repo: String
}
object ReposDeleteDeploymentEndpoint {
  
  @scala.inline
  def apply(deployment_id: Double, owner: String, repo: String): ReposDeleteDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteDeploymentEndpoint]
  }
  
  @scala.inline
  implicit class ReposDeleteDeploymentEndpointMutableBuilder[Self <: ReposDeleteDeploymentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment_id(value: Double): Self = StObject.set(x, "deployment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
