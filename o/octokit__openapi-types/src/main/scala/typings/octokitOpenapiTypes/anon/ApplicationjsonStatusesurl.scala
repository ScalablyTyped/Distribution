package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonStatusesurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Statusesurl
}
object ApplicationjsonStatusesurl {
  
  inline def apply(applicationSlashjson: Statusesurl): ApplicationjsonStatusesurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonStatusesurl]
  }
  
  extension [Self <: ApplicationjsonStatusesurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Statusesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
