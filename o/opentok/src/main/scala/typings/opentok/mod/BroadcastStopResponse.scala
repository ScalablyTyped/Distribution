package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastStopResponse extends StObject {
  
  var createdAt: Double
  
  var id: String
  
  var projectId: Double
  
  var resolution: String
  
  var sessionId: String
  
  var updatedAt: Double
}
object BroadcastStopResponse {
  
  inline def apply(
    createdAt: Double,
    id: String,
    projectId: Double,
    resolution: String,
    sessionId: String,
    updatedAt: Double
  ): BroadcastStopResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastStopResponse]
  }
  
  extension [Self <: BroadcastStopResponse](x: Self) {
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
