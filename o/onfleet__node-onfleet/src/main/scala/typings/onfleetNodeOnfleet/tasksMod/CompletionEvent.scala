package typings.onfleetNodeOnfleet.tasksMod

import typings.onfleetNodeOnfleet.destinationsMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEvent extends StObject {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var name: String
  
  var time: Double
}
object CompletionEvent {
  
  inline def apply(name: String, time: Double): CompletionEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEvent]
  }
  
  extension [Self <: CompletionEvent](x: Self) {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
