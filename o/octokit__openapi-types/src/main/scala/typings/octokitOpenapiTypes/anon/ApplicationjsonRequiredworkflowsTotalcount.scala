package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRequiredworkflowsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RequiredworkflowsTotalcount
}
object ApplicationjsonRequiredworkflowsTotalcount {
  
  inline def apply(applicationSlashjson: RequiredworkflowsTotalcount): ApplicationjsonRequiredworkflowsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRequiredworkflowsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRequiredworkflowsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RequiredworkflowsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
