package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonReadonly extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Readonly
}
object ApplicationjsonReadonly {
  
  inline def apply(applicationSlashjson: Readonly): ApplicationjsonReadonly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonReadonly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonReadonly] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Readonly): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
