package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConditions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Conditions
}
object ApplicationjsonConditions {
  
  inline def apply(applicationSlashjson: Conditions): ApplicationjsonConditions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonConditions] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Conditions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
