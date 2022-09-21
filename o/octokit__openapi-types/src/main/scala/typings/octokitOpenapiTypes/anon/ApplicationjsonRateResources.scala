package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRateResources extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RateResources
}
object ApplicationjsonRateResources {
  
  inline def apply(applicationSlashjson: RateResources): ApplicationjsonRateResources = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRateResources]
  }
  
  extension [Self <: ApplicationjsonRateResources](x: Self) {
    
    inline def setApplicationSlashjson(value: RateResources): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
