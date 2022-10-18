package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAll extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: All
}
object ApplicationjsonAll {
  
  inline def apply(applicationSlashjson: All): ApplicationjsonAll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAll]
  }
  
  extension [Self <: ApplicationjsonAll](x: Self) {
    
    inline def setApplicationSlashjson(value: All): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
