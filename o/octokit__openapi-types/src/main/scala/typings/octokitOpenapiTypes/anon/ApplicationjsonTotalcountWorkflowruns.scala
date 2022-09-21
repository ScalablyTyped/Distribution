package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalcountWorkflowruns extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: TotalcountWorkflowruns
}
object ApplicationjsonTotalcountWorkflowruns {
  
  inline def apply(applicationSlashjson: TotalcountWorkflowruns): ApplicationjsonTotalcountWorkflowruns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalcountWorkflowruns]
  }
  
  extension [Self <: ApplicationjsonTotalcountWorkflowruns](x: Self) {
    
    inline def setApplicationSlashjson(value: TotalcountWorkflowruns): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
