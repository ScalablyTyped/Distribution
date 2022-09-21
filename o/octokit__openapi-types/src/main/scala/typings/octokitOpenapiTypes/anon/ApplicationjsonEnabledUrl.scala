package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnabledUrl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EnabledUrl
}
object ApplicationjsonEnabledUrl {
  
  inline def apply(applicationSlashjson: EnabledUrl): ApplicationjsonEnabledUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnabledUrl]
  }
  
  extension [Self <: ApplicationjsonEnabledUrl](x: Self) {
    
    inline def setApplicationSlashjson(value: EnabledUrl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
