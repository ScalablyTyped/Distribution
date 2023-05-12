package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBypassmode extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Bypassmode
}
object ApplicationjsonBypassmode {
  
  inline def apply(applicationSlashjson: Bypassmode): ApplicationjsonBypassmode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBypassmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBypassmode] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Bypassmode): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
