package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConfigurationfilepath extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Configurationfilepath
}
object ApplicationjsonConfigurationfilepath {
  
  inline def apply(applicationSlashjson: Configurationfilepath): ApplicationjsonConfigurationfilepath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConfigurationfilepath]
  }
  
  extension [Self <: ApplicationjsonConfigurationfilepath](x: Self) {
    
    inline def setApplicationSlashjson(value: Configurationfilepath): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
