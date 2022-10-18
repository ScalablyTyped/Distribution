package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCompareurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Compareurl
}
object ApplicationjsonCompareurl {
  
  inline def apply(applicationSlashjson: Compareurl): ApplicationjsonCompareurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCompareurl]
  }
  
  extension [Self <: ApplicationjsonCompareurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Compareurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
