package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAvailablecustomdeploymentprotectionruleintegrations extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Availablecustomdeploymentprotectionruleintegrations
}
object ApplicationjsonAvailablecustomdeploymentprotectionruleintegrations {
  
  inline def apply(applicationSlashjson: Availablecustomdeploymentprotectionruleintegrations): ApplicationjsonAvailablecustomdeploymentprotectionruleintegrations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAvailablecustomdeploymentprotectionruleintegrations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAvailablecustomdeploymentprotectionruleintegrations] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Availablecustomdeploymentprotectionruleintegrations): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
