package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBypassactorsBypassmode extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BypassactorsBypassmode
}
object ApplicationjsonBypassactorsBypassmode {
  
  inline def apply(applicationSlashjson: BypassactorsBypassmode): ApplicationjsonBypassactorsBypassmode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBypassactorsBypassmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBypassactorsBypassmode] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BypassactorsBypassmode): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
