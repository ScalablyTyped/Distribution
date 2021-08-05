package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStatic extends StObject {
  
  /** The time to start displaying the overlay object, in seconds. Default: 0 */
  var startTimeOffset: js.UndefOr[String] = js.undefined
  
  /** Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. */
  var xy: js.UndefOr[NormalizedCoordinate] = js.undefined
}
object AnimationStatic {
  
  inline def apply(): AnimationStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationStatic]
  }
  
  extension [Self <: AnimationStatic](x: Self) {
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    inline def setXy(value: NormalizedCoordinate): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    inline def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
  }
}
