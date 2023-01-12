package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowedactions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowedactions
}
object ApplicationjsonAllowedactions {
  
  inline def apply(applicationSlashjson: Allowedactions): ApplicationjsonAllowedactions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowedactions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowedactions] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Allowedactions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
