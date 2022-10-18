package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonKeyReadonly extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: KeyReadonly
}
object ApplicationjsonKeyReadonly {
  
  inline def apply(applicationSlashjson: KeyReadonly): ApplicationjsonKeyReadonly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonKeyReadonly]
  }
  
  extension [Self <: ApplicationjsonKeyReadonly](x: Self) {
    
    inline def setApplicationSlashjson(value: KeyReadonly): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
