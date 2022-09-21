package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.watchStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchStartEvent
  extends StObject
     with ReporterEvent {
  
  val `type`: watchStart
}
object WatchStartEvent {
  
  inline def apply(): WatchStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("watchStart")
    __obj.asInstanceOf[WatchStartEvent]
  }
  
  extension [Self <: WatchStartEvent](x: Self) {
    
    inline def setType(value: watchStart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
