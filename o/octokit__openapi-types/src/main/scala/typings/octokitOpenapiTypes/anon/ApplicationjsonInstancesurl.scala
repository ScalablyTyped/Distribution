package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInstancesurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Instancesurl
}
object ApplicationjsonInstancesurl {
  
  inline def apply(applicationSlashjson: Instancesurl): ApplicationjsonInstancesurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInstancesurl]
  }
  
  extension [Self <: ApplicationjsonInstancesurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Instancesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
