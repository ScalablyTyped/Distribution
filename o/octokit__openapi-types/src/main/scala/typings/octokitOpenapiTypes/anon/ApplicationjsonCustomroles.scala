package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCustomroles extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Customroles
}
object ApplicationjsonCustomroles {
  
  inline def apply(applicationSlashjson: Customroles): ApplicationjsonCustomroles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCustomroles]
  }
  
  extension [Self <: ApplicationjsonCustomroles](x: Self) {
    
    inline def setApplicationSlashjson(value: Customroles): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
