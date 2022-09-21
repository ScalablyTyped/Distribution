package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCurrentuserorganizationurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Currentuserorganizationurl
}
object ApplicationjsonCurrentuserorganizationurl {
  
  inline def apply(applicationSlashjson: Currentuserorganizationurl): ApplicationjsonCurrentuserorganizationurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCurrentuserorganizationurl]
  }
  
  extension [Self <: ApplicationjsonCurrentuserorganizationurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Currentuserorganizationurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
