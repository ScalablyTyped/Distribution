package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTargeturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Targeturl
}
object ApplicationjsonTargeturl {
  
  inline def apply(applicationSlashjson: Targeturl): ApplicationjsonTargeturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTargeturl]
  }
  
  extension [Self <: ApplicationjsonTargeturl](x: Self) {
    
    inline def setApplicationSlashjson(value: Targeturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
