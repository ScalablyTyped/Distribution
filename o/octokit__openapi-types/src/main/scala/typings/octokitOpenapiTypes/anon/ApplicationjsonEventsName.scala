package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEventsName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EventsName
}
object ApplicationjsonEventsName {
  
  inline def apply(applicationSlashjson: EventsName): ApplicationjsonEventsName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEventsName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEventsName] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: EventsName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
