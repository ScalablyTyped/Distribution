package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorStreamInfo extends StObject {
  
  /** If you have set the enableMonitorStream property to true, then this property determines the length of the live broadcast delay. */
  var broadcastStreamDelayMs: js.UndefOr[Double] = js.undefined
  
  /** HTML code that embeds a player that plays the monitor stream. */
  var embedHtml: js.UndefOr[String] = js.undefined
  
  /**
    * This value determines whether the monitor stream is enabled for the broadcast. If the monitor stream is enabled, then YouTube will broadcast the event content on a special stream
    * intended only for the broadcaster's consumption. The broadcaster can use the stream to review the event content and also to identify the optimal times to insert cuepoints. You need
    * to set this value to true if you intend to have a broadcast delay for your event. *Note:* This property cannot be updated once the broadcast is in the testing or live state.
    */
  var enableMonitorStream: js.UndefOr[Boolean] = js.undefined
}
object MonitorStreamInfo {
  
  inline def apply(): MonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorStreamInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorStreamInfo] (val x: Self) extends AnyVal {
    
    inline def setBroadcastStreamDelayMs(value: Double): Self = StObject.set(x, "broadcastStreamDelayMs", value.asInstanceOf[js.Any])
    
    inline def setBroadcastStreamDelayMsUndefined: Self = StObject.set(x, "broadcastStreamDelayMs", js.undefined)
    
    inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
    
    inline def setEnableMonitorStream(value: Boolean): Self = StObject.set(x, "enableMonitorStream", value.asInstanceOf[js.Any])
    
    inline def setEnableMonitorStreamUndefined: Self = StObject.set(x, "enableMonitorStream", js.undefined)
  }
}
