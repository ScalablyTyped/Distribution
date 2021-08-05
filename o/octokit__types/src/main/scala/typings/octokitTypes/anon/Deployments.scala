package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployments extends StObject {
  
  var deployments: String
  
  var metadata: String
  
  var pull_requests: String
  
  var statuses: String
}
object Deployments {
  
  inline def apply(deployments: String, metadata: String, pull_requests: String, statuses: String): Deployments = {
    val __obj = js.Dynamic.literal(deployments = deployments.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployments]
  }
  
  extension [Self <: Deployments](x: Self) {
    
    inline def setDeployments(value: String): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setPull_requests(value: String): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setStatuses(value: String): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
  }
}
