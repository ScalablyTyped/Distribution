package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRules extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Rules
}
object ApplicationjsonRules {
  
  inline def apply(applicationSlashjson: Rules): ApplicationjsonRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRules] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Rules): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
