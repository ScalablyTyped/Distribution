package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Deploy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetDeploymentResponseData extends StObject {
  
  var created_at: String
  
  var creator: Avatarurl
  
  var description: String
  
  var environment: String
  
  var id: Double
  
  var node_id: String
  
  var original_environment: String
  
  var payload: Deploy
  
  var production_environment: Boolean
  
  var ref: String
  
  var repository_url: String
  
  var sha: String
  
  var statuses_url: String
  
  var task: String
  
  var transient_environment: Boolean
  
  var updated_at: String
  
  var url: String
}
object ReposGetDeploymentResponseData {
  
  inline def apply(
    created_at: String,
    creator: Avatarurl,
    description: String,
    environment: String,
    id: Double,
    node_id: String,
    original_environment: String,
    payload: Deploy,
    production_environment: Boolean,
    ref: String,
    repository_url: String,
    sha: String,
    statuses_url: String,
    task: String,
    transient_environment: Boolean,
    updated_at: String,
    url: String
  ): ReposGetDeploymentResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_environment = original_environment.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], production_environment = production_environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], transient_environment = transient_environment.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetDeploymentResponseData]
  }
  
  extension [Self <: ReposGetDeploymentResponseData](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_environment(value: String): Self = StObject.set(x, "original_environment", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Deploy): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProduction_environment(value: Boolean): Self = StObject.set(x, "production_environment", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTransient_environment(value: Boolean): Self = StObject.set(x, "transient_environment", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
