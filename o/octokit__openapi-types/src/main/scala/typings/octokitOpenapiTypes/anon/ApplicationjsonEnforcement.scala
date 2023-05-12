package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnforcement extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Enforcement
}
object ApplicationjsonEnforcement {
  
  inline def apply(applicationSlashjson: Enforcement): ApplicationjsonEnforcement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnforcement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEnforcement] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Enforcement): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
