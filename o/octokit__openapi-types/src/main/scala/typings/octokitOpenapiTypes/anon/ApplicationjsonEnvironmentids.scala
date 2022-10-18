package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnvironmentids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Environmentids
}
object ApplicationjsonEnvironmentids {
  
  inline def apply(applicationSlashjson: Environmentids): ApplicationjsonEnvironmentids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnvironmentids]
  }
  
  extension [Self <: ApplicationjsonEnvironmentids](x: Self) {
    
    inline def setApplicationSlashjson(value: Environmentids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
