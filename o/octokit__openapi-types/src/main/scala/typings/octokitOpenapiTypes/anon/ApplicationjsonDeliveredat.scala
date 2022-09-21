package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDeliveredat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deliveredat
}
object ApplicationjsonDeliveredat {
  
  inline def apply(applicationSlashjson: Deliveredat): ApplicationjsonDeliveredat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDeliveredat]
  }
  
  extension [Self <: ApplicationjsonDeliveredat](x: Self) {
    
    inline def setApplicationSlashjson(value: Deliveredat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
