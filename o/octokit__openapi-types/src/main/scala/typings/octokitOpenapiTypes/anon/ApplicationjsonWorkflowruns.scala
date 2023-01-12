package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonWorkflowruns extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Workflowruns
}
object ApplicationjsonWorkflowruns {
  
  inline def apply(applicationSlashjson: Workflowruns): ApplicationjsonWorkflowruns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonWorkflowruns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonWorkflowruns] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Workflowruns): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
