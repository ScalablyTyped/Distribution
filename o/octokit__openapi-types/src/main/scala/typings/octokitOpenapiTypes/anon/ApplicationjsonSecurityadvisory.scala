package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSecurityadvisory extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Securityadvisory
}
object ApplicationjsonSecurityadvisory {
  
  inline def apply(applicationSlashjson: Securityadvisory): ApplicationjsonSecurityadvisory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSecurityadvisory]
  }
  
  extension [Self <: ApplicationjsonSecurityadvisory](x: Self) {
    
    inline def setApplicationSlashjson(value: Securityadvisory): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
