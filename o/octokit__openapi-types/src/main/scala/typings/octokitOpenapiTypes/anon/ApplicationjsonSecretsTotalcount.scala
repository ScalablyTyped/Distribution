package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSecretsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: SecretsTotalcount
}
object ApplicationjsonSecretsTotalcount {
  
  inline def apply(applicationSlashjson: SecretsTotalcount): ApplicationjsonSecretsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSecretsTotalcount]
  }
  
  extension [Self <: ApplicationjsonSecretsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: SecretsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
