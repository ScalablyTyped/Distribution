package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAddevents extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Addevents
}
object ApplicationjsonAddevents {
  
  inline def apply(applicationSlashjson: Addevents): ApplicationjsonAddevents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAddevents]
  }
  
  extension [Self <: ApplicationjsonAddevents](x: Self) {
    
    inline def setApplicationSlashjson(value: Addevents): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
