package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastStopResponse extends StObject {
  
  var createdAt: Double = js.native
  
  var id: String = js.native
  
  var projectId: Double = js.native
  
  var resolution: String = js.native
  
  var sessionId: String = js.native
  
  var updatedAt: Double = js.native
}
object BroadcastStopResponse {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BroadcastStopResponseMutableBuilder[Self <: BroadcastStopResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
