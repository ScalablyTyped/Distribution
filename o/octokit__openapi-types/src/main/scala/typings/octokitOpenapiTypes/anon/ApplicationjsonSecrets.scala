package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSecrets extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Secrets
}
object ApplicationjsonSecrets {
  
  inline def apply(applicationSlashjson: Secrets): ApplicationjsonSecrets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSecrets]
  }
  
  extension [Self <: ApplicationjsonSecrets](x: Self) {
    
    inline def setApplicationSlashjson(value: Secrets): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
