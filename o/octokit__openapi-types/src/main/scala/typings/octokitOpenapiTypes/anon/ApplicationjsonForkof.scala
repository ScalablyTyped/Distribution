package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonForkof extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Forkof
}
object ApplicationjsonForkof {
  
  inline def apply(applicationSlashjson: Forkof): ApplicationjsonForkof = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonForkof]
  }
  
  extension [Self <: ApplicationjsonForkof](x: Self) {
    
    inline def setApplicationSlashjson(value: Forkof): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
