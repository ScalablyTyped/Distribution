package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUsedefault extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Usedefault
}
object ApplicationjsonUsedefault {
  
  inline def apply(applicationSlashjson: Usedefault): ApplicationjsonUsedefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUsedefault]
  }
  
  extension [Self <: ApplicationjsonUsedefault](x: Self) {
    
    inline def setApplicationSlashjson(value: Usedefault): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
