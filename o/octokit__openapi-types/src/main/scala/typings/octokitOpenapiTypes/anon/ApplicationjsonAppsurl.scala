package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAppsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Appsurl
}
object ApplicationjsonAppsurl {
  
  inline def apply(applicationSlashjson: Appsurl): ApplicationjsonAppsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAppsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAppsurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Appsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
