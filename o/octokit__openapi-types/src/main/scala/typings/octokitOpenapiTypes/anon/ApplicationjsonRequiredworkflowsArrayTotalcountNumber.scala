package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRequiredworkflowsArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RequiredworkflowsArrayTotalcountNumber
}
object ApplicationjsonRequiredworkflowsArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: RequiredworkflowsArrayTotalcountNumber): ApplicationjsonRequiredworkflowsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRequiredworkflowsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRequiredworkflowsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RequiredworkflowsArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
