package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnvironmentsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EnvironmentsTotalcount
}
object ApplicationjsonEnvironmentsTotalcount {
  
  inline def apply(applicationSlashjson: EnvironmentsTotalcount): ApplicationjsonEnvironmentsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnvironmentsTotalcount]
  }
  
  extension [Self <: ApplicationjsonEnvironmentsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: EnvironmentsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
