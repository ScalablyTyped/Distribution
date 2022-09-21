package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPushprotectionbypassedby extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Pushprotectionbypassedby
}
object ApplicationjsonPushprotectionbypassedby {
  
  inline def apply(applicationSlashjson: Pushprotectionbypassedby): ApplicationjsonPushprotectionbypassedby = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPushprotectionbypassedby]
  }
  
  extension [Self <: ApplicationjsonPushprotectionbypassedby](x: Self) {
    
    inline def setApplicationSlashjson(value: Pushprotectionbypassedby): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
