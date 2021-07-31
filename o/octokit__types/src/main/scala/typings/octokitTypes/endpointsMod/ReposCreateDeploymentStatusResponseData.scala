package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateDeploymentStatusResponseData extends StObject {
  
  var created_at: String
  
  var creator: Avatarurl
  
  var deployment_url: String
  
  var description: String
  
  var environment: String
  
  var environment_url: String
  
  var id: Double
  
  var log_url: String
  
  var node_id: String
  
  var repository_url: String
  
  var state: String
  
  var target_url: String
  
  var updated_at: String
  
  var url: String
}
object ReposCreateDeploymentStatusResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    creator: Avatarurl,
    deployment_url: String,
    description: String,
    environment: String,
    environment_url: String,
    id: Double,
    log_url: String,
    node_id: String,
    repository_url: String,
    state: String,
    target_url: String,
    updated_at: String,
    url: String
  ): ReposCreateDeploymentStatusResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], deployment_url = deployment_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentStatusResponseData]
  }
  
  @scala.inline
  implicit class ReposCreateDeploymentStatusResponseDataMutableBuilder[Self <: ReposCreateDeploymentStatusResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment_url(value: String): Self = StObject.set(x, "deployment_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_url(value: String): Self = StObject.set(x, "environment_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_url(value: String): Self = StObject.set(x, "log_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
