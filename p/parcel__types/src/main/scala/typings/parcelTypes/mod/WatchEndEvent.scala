package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.watchEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchEndEvent
  extends StObject
     with ReporterEvent {
  
  val `type`: watchEnd
}
object WatchEndEvent {
  
  inline def apply(): WatchEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("watchEnd")
    __obj.asInstanceOf[WatchEndEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchEndEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: watchEnd): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
