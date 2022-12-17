package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedatDeploymentbranchpolicy extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreatedatDeploymentbranchpolicy
}
object ApplicationjsonCreatedatDeploymentbranchpolicy {
  
  inline def apply(applicationSlashjson: CreatedatDeploymentbranchpolicy): ApplicationjsonCreatedatDeploymentbranchpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedatDeploymentbranchpolicy]
  }
  
  extension [Self <: ApplicationjsonCreatedatDeploymentbranchpolicy](x: Self) {
    
    inline def setApplicationSlashjson(value: CreatedatDeploymentbranchpolicy): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
