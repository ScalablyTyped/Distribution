package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveStreamStatus extends StObject {
  
  /** The health status of the stream. */
  var healthStatus: js.UndefOr[LiveStreamHealthStatus] = js.undefined
  
  var streamStatus: js.UndefOr[String] = js.undefined
}
object LiveStreamStatus {
  
  @scala.inline
  def apply(): LiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamStatus]
  }
  
  @scala.inline
  implicit class LiveStreamStatusMutableBuilder[Self <: LiveStreamStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: LiveStreamHealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    @scala.inline
    def setStreamStatus(value: String): Self = StObject.set(x, "streamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamStatusUndefined: Self = StObject.set(x, "streamStatus", js.undefined)
  }
}
