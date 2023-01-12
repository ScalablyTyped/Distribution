package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyEvent extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyEvent
}
object ApplicationjsonBodyEvent {
  
  inline def apply(applicationSlashjson: BodyEvent): ApplicationjsonBodyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBodyEvent] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BodyEvent): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
