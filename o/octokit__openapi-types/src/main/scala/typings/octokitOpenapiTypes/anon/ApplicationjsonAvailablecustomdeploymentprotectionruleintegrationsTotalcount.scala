package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AvailablecustomdeploymentprotectionruleintegrationsTotalcount
}
object ApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount {
  
  inline def apply(applicationSlashjson: AvailablecustomdeploymentprotectionruleintegrationsTotalcount): ApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAvailablecustomdeploymentprotectionruleintegrationsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: AvailablecustomdeploymentprotectionruleintegrationsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
