package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDeployment extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deployment
}
object ApplicationjsonDeployment {
  
  inline def apply(applicationSlashjson: Deployment): ApplicationjsonDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDeployment]
  }
  
  extension [Self <: ApplicationjsonDeployment](x: Self) {
    
    inline def setApplicationSlashjson(value: Deployment): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
