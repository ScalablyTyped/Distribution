package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationFade extends StObject {
  
  /** The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s */
  var endTimeOffset: js.UndefOr[String] = js.undefined
  
  /** Required. Type of fade animation: `FADE_IN` or `FADE_OUT`. */
  var fadeType: js.UndefOr[String] = js.undefined
  
  /** The time to start the fade animation, in seconds. Default: 0 */
  var startTimeOffset: js.UndefOr[String] = js.undefined
  
  /**
    * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates
    * {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
    */
  var xy: js.UndefOr[NormalizedCoordinate] = js.undefined
}
object AnimationFade {
  
  inline def apply(): AnimationFade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationFade]
  }
  
  extension [Self <: AnimationFade](x: Self) {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setFadeType(value: String): Self = StObject.set(x, "fadeType", value.asInstanceOf[js.Any])
    
    inline def setFadeTypeUndefined: Self = StObject.set(x, "fadeType", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    inline def setXy(value: NormalizedCoordinate): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    inline def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
  }
}
