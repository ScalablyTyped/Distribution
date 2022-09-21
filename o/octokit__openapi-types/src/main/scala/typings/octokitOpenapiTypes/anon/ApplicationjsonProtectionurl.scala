package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonProtectionurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Protectionurl
}
object ApplicationjsonProtectionurl {
  
  inline def apply(applicationSlashjson: Protectionurl): ApplicationjsonProtectionurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonProtectionurl]
  }
  
  extension [Self <: ApplicationjsonProtectionurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Protectionurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
