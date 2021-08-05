package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEnd extends StObject {
  
  /** The time to end overlay object, in seconds. Default: 0 */
  var startTimeOffset: js.UndefOr[String] = js.undefined
}
object AnimationEnd {
  
  inline def apply(): AnimationEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEnd]
  }
  
  extension [Self <: AnimationEnd](x: Self) {
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
