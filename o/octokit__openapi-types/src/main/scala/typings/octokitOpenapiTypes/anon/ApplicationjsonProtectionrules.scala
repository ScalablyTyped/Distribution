package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonProtectionrules extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Protectionrules
}
object ApplicationjsonProtectionrules {
  
  inline def apply(applicationSlashjson: Protectionrules): ApplicationjsonProtectionrules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonProtectionrules]
  }
  
  extension [Self <: ApplicationjsonProtectionrules](x: Self) {
    
    inline def setApplicationSlashjson(value: Protectionrules): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
