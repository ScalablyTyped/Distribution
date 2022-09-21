package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBody extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Body
}
object ApplicationjsonBody {
  
  inline def apply(applicationSlashjson: Body): ApplicationjsonBody = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBody]
  }
  
  extension [Self <: ApplicationjsonBody](x: Self) {
    
    inline def setApplicationSlashjson(value: Body): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
