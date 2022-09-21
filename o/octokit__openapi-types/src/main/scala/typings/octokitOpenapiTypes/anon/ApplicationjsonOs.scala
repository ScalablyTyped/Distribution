package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOs extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Os
}
object ApplicationjsonOs {
  
  inline def apply(applicationSlashjson: Os): ApplicationjsonOs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOs]
  }
  
  extension [Self <: ApplicationjsonOs](x: Self) {
    
    inline def setApplicationSlashjson(value: Os): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
