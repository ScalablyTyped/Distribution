package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBusinessplus extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Businessplus
}
object ApplicationjsonBusinessplus {
  
  inline def apply(applicationSlashjson: Businessplus): ApplicationjsonBusinessplus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBusinessplus]
  }
  
  extension [Self <: ApplicationjsonBusinessplus](x: Self) {
    
    inline def setApplicationSlashjson(value: Businessplus): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
