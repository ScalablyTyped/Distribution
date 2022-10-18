package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyBodyhtml extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyBodyhtml
}
object ApplicationjsonBodyBodyhtml {
  
  inline def apply(applicationSlashjson: BodyBodyhtml): ApplicationjsonBodyBodyhtml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyBodyhtml]
  }
  
  extension [Self <: ApplicationjsonBodyBodyhtml](x: Self) {
    
    inline def setApplicationSlashjson(value: BodyBodyhtml): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
