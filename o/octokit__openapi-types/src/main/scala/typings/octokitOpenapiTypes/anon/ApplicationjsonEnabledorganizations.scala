package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnabledorganizations extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Enabledorganizations
}
object ApplicationjsonEnabledorganizations {
  
  inline def apply(applicationSlashjson: Enabledorganizations): ApplicationjsonEnabledorganizations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnabledorganizations]
  }
  
  extension [Self <: ApplicationjsonEnabledorganizations](x: Self) {
    
    inline def setApplicationSlashjson(value: Enabledorganizations): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
