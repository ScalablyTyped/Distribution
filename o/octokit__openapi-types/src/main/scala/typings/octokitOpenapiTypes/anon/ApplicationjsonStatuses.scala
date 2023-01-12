package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonStatuses extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Statuses
}
object ApplicationjsonStatuses {
  
  inline def apply(applicationSlashjson: Statuses): ApplicationjsonStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonStatuses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonStatuses] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Statuses): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
