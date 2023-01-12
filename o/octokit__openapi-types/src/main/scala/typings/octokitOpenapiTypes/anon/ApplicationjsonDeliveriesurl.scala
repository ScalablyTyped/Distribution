package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDeliveriesurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deliveriesurl
}
object ApplicationjsonDeliveriesurl {
  
  inline def apply(applicationSlashjson: Deliveriesurl): ApplicationjsonDeliveriesurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDeliveriesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDeliveriesurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Deliveriesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
