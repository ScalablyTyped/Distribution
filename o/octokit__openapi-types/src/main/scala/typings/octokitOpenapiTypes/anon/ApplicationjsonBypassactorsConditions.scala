package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBypassactorsConditions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BypassactorsConditions
}
object ApplicationjsonBypassactorsConditions {
  
  inline def apply(applicationSlashjson: BypassactorsConditions): ApplicationjsonBypassactorsConditions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBypassactorsConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBypassactorsConditions] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BypassactorsConditions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
