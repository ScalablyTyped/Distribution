package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonResources extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Resources
}
object ApplicationjsonResources {
  
  inline def apply(applicationSlashjson: Resources): ApplicationjsonResources = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonResources]
  }
  
  extension [Self <: ApplicationjsonResources](x: Self) {
    
    inline def setApplicationSlashjson(value: Resources): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
