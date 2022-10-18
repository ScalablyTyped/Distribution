package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBillableownerDefaults extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BillableownerDefaults
}
object ApplicationjsonBillableownerDefaults {
  
  inline def apply(applicationSlashjson: BillableownerDefaults): ApplicationjsonBillableownerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBillableownerDefaults]
  }
  
  extension [Self <: ApplicationjsonBillableownerDefaults](x: Self) {
    
    inline def setApplicationSlashjson(value: BillableownerDefaults): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
