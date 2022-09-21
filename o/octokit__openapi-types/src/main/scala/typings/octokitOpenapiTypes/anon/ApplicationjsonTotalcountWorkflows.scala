package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalcountWorkflows extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: TotalcountWorkflows
}
object ApplicationjsonTotalcountWorkflows {
  
  inline def apply(applicationSlashjson: TotalcountWorkflows): ApplicationjsonTotalcountWorkflows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalcountWorkflows]
  }
  
  extension [Self <: ApplicationjsonTotalcountWorkflows](x: Self) {
    
    inline def setApplicationSlashjson(value: TotalcountWorkflows): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
