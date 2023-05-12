package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonVariablesArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: VariablesArray
}
object ApplicationjsonVariablesArray {
  
  inline def apply(applicationSlashjson: VariablesArray): ApplicationjsonVariablesArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: VariablesArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
