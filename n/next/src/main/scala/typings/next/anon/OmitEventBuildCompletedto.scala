package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/dist/telemetry/events/build.EventBuildCompleted, 'totalPageCount' | 'hasDunderPages' | 'hasTestPages'> */
trait OmitEventBuildCompletedto extends StObject {
  
  var durationInSeconds: Double
}
object OmitEventBuildCompletedto {
  
  inline def apply(durationInSeconds: Double): OmitEventBuildCompletedto = {
    val __obj = js.Dynamic.literal(durationInSeconds = durationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEventBuildCompletedto]
  }
  
  extension [Self <: OmitEventBuildCompletedto](x: Self) {
    
    inline def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
  }
}
