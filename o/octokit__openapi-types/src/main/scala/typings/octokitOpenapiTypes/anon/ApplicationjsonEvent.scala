package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEvent extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Event
}
object ApplicationjsonEvent {
  
  inline def apply(applicationSlashjson: Event): ApplicationjsonEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEvent] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Event): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
