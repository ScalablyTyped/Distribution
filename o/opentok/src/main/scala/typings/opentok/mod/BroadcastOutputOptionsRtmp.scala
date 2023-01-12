package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastOutputOptionsRtmp extends StObject {
  
  var id: String
  
  var serverUrl: String
  
  var status: js.UndefOr[String] = js.undefined
  
  var streamName: String
}
object BroadcastOutputOptionsRtmp {
  
  inline def apply(id: String, serverUrl: String, streamName: String): BroadcastOutputOptionsRtmp = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOutputOptionsRtmp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastOutputOptionsRtmp] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
