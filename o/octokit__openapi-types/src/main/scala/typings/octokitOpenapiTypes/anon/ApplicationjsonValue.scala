package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonValue extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Value
}
object ApplicationjsonValue {
  
  inline def apply(applicationSlashjson: Value): ApplicationjsonValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonValue] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Value): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
