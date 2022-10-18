package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonActiveConfigEvents extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ActiveConfigEvents
}
object ApplicationjsonActiveConfigEvents {
  
  inline def apply(applicationSlashjson: ActiveConfigEvents): ApplicationjsonActiveConfigEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonActiveConfigEvents]
  }
  
  extension [Self <: ApplicationjsonActiveConfigEvents](x: Self) {
    
    inline def setApplicationSlashjson(value: ActiveConfigEvents): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
