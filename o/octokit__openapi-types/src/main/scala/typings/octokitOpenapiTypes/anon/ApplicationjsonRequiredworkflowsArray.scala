package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRequiredworkflowsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RequiredworkflowsArray
}
object ApplicationjsonRequiredworkflowsArray {
  
  inline def apply(applicationSlashjson: RequiredworkflowsArray): ApplicationjsonRequiredworkflowsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRequiredworkflowsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRequiredworkflowsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RequiredworkflowsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
