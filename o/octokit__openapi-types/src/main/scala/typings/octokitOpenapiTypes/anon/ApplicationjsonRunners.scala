package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunners extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Runners
}
object ApplicationjsonRunners {
  
  inline def apply(applicationSlashjson: Runners): ApplicationjsonRunners = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunners]
  }
  
  extension [Self <: ApplicationjsonRunners](x: Self) {
    
    inline def setApplicationSlashjson(value: Runners): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
