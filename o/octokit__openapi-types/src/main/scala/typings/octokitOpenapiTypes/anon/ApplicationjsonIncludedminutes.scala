package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncludedminutes extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Includedminutes
}
object ApplicationjsonIncludedminutes {
  
  inline def apply(applicationSlashjson: Includedminutes): ApplicationjsonIncludedminutes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncludedminutes]
  }
  
  extension [Self <: ApplicationjsonIncludedminutes](x: Self) {
    
    inline def setApplicationSlashjson(value: Includedminutes): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
