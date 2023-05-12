package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonWorkflowfilepath extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Workflowfilepath
}
object ApplicationjsonWorkflowfilepath {
  
  inline def apply(applicationSlashjson: Workflowfilepath): ApplicationjsonWorkflowfilepath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonWorkflowfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonWorkflowfilepath] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Workflowfilepath): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
