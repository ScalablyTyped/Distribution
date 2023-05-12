package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConditionsEnforcement extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ConditionsEnforcement
}
object ApplicationjsonConditionsEnforcement {
  
  inline def apply(applicationSlashjson: ConditionsEnforcement): ApplicationjsonConditionsEnforcement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConditionsEnforcement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonConditionsEnforcement] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ConditionsEnforcement): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
