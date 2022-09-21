package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInstallationsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: InstallationsTotalcount
}
object ApplicationjsonInstallationsTotalcount {
  
  inline def apply(applicationSlashjson: InstallationsTotalcount): ApplicationjsonInstallationsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInstallationsTotalcount]
  }
  
  extension [Self <: ApplicationjsonInstallationsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: InstallationsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
