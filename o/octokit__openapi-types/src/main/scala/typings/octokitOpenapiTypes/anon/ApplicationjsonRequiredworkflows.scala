package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRequiredworkflows extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Requiredworkflows
}
object ApplicationjsonRequiredworkflows {
  
  inline def apply(applicationSlashjson: Requiredworkflows): ApplicationjsonRequiredworkflows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRequiredworkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRequiredworkflows] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Requiredworkflows): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
