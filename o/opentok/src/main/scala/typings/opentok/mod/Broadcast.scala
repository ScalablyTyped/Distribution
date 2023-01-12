package typings.opentok.mod

import typings.opentok.opentokStrings.`1280x720`
import typings.opentok.opentokStrings.`640x480`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broadcast extends StObject {
  
  var broadcastUrls: BroadcastUrlsResponse
  
  var createdAt: Double
  
  var id: String
  
  var projectId: Double
  
  var resolution: `640x480` | `1280x720`
  
  var sessionId: String
  
  var status: String
  
  def stop(callback: js.Function2[/* error */ js.Error | Null, /* broadcast */ this.type, Unit]): Unit
  
  var updatedAt: Double
}
object Broadcast {
  
  inline def apply(
    broadcastUrls: BroadcastUrlsResponse,
    createdAt: Double,
    id: String,
    projectId: Double,
    resolution: `640x480` | `1280x720`,
    sessionId: String,
    status: String,
    stop: js.Function2[/* error */ js.Error | Null, Broadcast, Unit] => Unit,
    updatedAt: Double
  ): Broadcast = {
    val __obj = js.Dynamic.literal(broadcastUrls = broadcastUrls.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction1(stop), updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Broadcast] (val x: Self) extends AnyVal {
    
    inline def setBroadcastUrls(value: BroadcastUrlsResponse): Self = StObject.set(x, "broadcastUrls", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: `640x480` | `1280x720`): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStop(value: js.Function2[/* error */ js.Error | Null, Broadcast, Unit] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
