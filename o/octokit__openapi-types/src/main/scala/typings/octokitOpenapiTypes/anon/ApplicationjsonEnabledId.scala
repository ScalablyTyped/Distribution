package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnabledId extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EnabledId
}
object ApplicationjsonEnabledId {
  
  inline def apply(applicationSlashjson: EnabledId): ApplicationjsonEnabledId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnabledId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEnabledId] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: EnabledId): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
