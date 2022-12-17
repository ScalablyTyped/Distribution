package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedorganizationsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Selectedorganizationsurl
}
object ApplicationjsonSelectedorganizationsurl {
  
  inline def apply(applicationSlashjson: Selectedorganizationsurl): ApplicationjsonSelectedorganizationsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedorganizationsurl]
  }
  
  extension [Self <: ApplicationjsonSelectedorganizationsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Selectedorganizationsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
