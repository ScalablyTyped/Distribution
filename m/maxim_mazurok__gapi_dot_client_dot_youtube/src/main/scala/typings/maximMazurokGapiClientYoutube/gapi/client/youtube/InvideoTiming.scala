package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvideoTiming extends StObject {
  
  /** Defines the duration in milliseconds for which the promotion should be displayed. If missing, the client should use the default. */
  var durationMs: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the time at which the promotion will appear. Depending on the value of type the value of the offsetMs field will represent a time offset from the start or from the end of
    * the video, expressed in milliseconds.
    */
  var offsetMs: js.UndefOr[String] = js.undefined
  
  /**
    * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs
    * field represents an offset from the end of the video.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object InvideoTiming {
  
  inline def apply(): InvideoTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvideoTiming] (val x: Self) extends AnyVal {
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setOffsetMs(value: String): Self = StObject.set(x, "offsetMs", value.asInstanceOf[js.Any])
    
    inline def setOffsetMsUndefined: Self = StObject.set(x, "offsetMs", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
