package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSubmodulegiturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Submodulegiturl
}
object ApplicationjsonSubmodulegiturl {
  
  inline def apply(applicationSlashjson: Submodulegiturl): ApplicationjsonSubmodulegiturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSubmodulegiturl]
  }
  
  extension [Self <: ApplicationjsonSubmodulegiturl](x: Self) {
    
    inline def setApplicationSlashjson(value: Submodulegiturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
