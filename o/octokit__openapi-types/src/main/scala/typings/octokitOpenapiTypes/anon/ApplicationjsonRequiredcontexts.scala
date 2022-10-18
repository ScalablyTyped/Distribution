package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRequiredcontexts extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Requiredcontexts
}
object ApplicationjsonRequiredcontexts {
  
  inline def apply(applicationSlashjson: Requiredcontexts): ApplicationjsonRequiredcontexts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRequiredcontexts]
  }
  
  extension [Self <: ApplicationjsonRequiredcontexts](x: Self) {
    
    inline def setApplicationSlashjson(value: Requiredcontexts): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
