package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMaintainers extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Maintainers
}
object ApplicationjsonMaintainers {
  
  inline def apply(applicationSlashjson: Maintainers): ApplicationjsonMaintainers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMaintainers]
  }
  
  extension [Self <: ApplicationjsonMaintainers](x: Self) {
    
    inline def setApplicationSlashjson(value: Maintainers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
