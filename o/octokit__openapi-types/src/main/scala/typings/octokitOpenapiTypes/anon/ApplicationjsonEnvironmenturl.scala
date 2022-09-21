package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnvironmenturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Environmenturl
}
object ApplicationjsonEnvironmenturl {
  
  inline def apply(applicationSlashjson: Environmenturl): ApplicationjsonEnvironmenturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnvironmenturl]
  }
  
  extension [Self <: ApplicationjsonEnvironmenturl](x: Self) {
    
    inline def setApplicationSlashjson(value: Environmenturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
