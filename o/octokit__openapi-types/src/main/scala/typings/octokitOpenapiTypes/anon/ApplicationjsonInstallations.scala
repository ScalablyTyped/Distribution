package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInstallations extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Installations
}
object ApplicationjsonInstallations {
  
  inline def apply(applicationSlashjson: Installations): ApplicationjsonInstallations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInstallations]
  }
  
  extension [Self <: ApplicationjsonInstallations](x: Self) {
    
    inline def setApplicationSlashjson(value: Installations): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
