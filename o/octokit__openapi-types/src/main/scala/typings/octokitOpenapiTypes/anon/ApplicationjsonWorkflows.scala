package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonWorkflows extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Workflows
}
object ApplicationjsonWorkflows {
  
  inline def apply(applicationSlashjson: Workflows): ApplicationjsonWorkflows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonWorkflows]
  }
  
  extension [Self <: ApplicationjsonWorkflows](x: Self) {
    
    inline def setApplicationSlashjson(value: Workflows): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
