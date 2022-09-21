package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDaysleftinbillingcycle extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Daysleftinbillingcycle
}
object ApplicationjsonDaysleftinbillingcycle {
  
  inline def apply(applicationSlashjson: Daysleftinbillingcycle): ApplicationjsonDaysleftinbillingcycle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDaysleftinbillingcycle]
  }
  
  extension [Self <: ApplicationjsonDaysleftinbillingcycle](x: Self) {
    
    inline def setApplicationSlashjson(value: Daysleftinbillingcycle): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
