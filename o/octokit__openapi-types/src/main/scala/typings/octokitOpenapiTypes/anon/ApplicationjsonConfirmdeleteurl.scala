package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConfirmdeleteurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Confirmdeleteurl
}
object ApplicationjsonConfirmdeleteurl {
  
  inline def apply(applicationSlashjson: Confirmdeleteurl): ApplicationjsonConfirmdeleteurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConfirmdeleteurl]
  }
  
  extension [Self <: ApplicationjsonConfirmdeleteurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Confirmdeleteurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
