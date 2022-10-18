package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonClientsecret extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Clientsecret
}
object ApplicationjsonClientsecret {
  
  inline def apply(applicationSlashjson: Clientsecret): ApplicationjsonClientsecret = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonClientsecret]
  }
  
  extension [Self <: ApplicationjsonClientsecret](x: Self) {
    
    inline def setApplicationSlashjson(value: Clientsecret): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
