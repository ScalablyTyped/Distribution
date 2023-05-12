package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalcountNumberVariablesArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: TotalcountNumberVariablesArray
}
object ApplicationjsonTotalcountNumberVariablesArray {
  
  inline def apply(applicationSlashjson: TotalcountNumberVariablesArray): ApplicationjsonTotalcountNumberVariablesArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalcountNumberVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonTotalcountNumberVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: TotalcountNumberVariablesArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
