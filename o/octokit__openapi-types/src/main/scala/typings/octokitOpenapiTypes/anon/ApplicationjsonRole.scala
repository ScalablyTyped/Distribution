package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRole extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Role
}
object ApplicationjsonRole {
  
  inline def apply(applicationSlashjson: Role): ApplicationjsonRole = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRole]
  }
  
  extension [Self <: ApplicationjsonRole](x: Self) {
    
    inline def setApplicationSlashjson(value: Role): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
