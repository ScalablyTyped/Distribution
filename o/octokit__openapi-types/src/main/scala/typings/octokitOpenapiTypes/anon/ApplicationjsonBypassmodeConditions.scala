package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBypassmodeConditions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BypassmodeConditions
}
object ApplicationjsonBypassmodeConditions {
  
  inline def apply(applicationSlashjson: BypassmodeConditions): ApplicationjsonBypassmodeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBypassmodeConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBypassmodeConditions] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BypassmodeConditions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
