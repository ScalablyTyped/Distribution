package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDefaultbranch extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Defaultbranch
}
object ApplicationjsonDefaultbranch {
  
  inline def apply(applicationSlashjson: Defaultbranch): ApplicationjsonDefaultbranch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDefaultbranch]
  }
  
  extension [Self <: ApplicationjsonDefaultbranch](x: Self) {
    
    inline def setApplicationSlashjson(value: Defaultbranch): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
