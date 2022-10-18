package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowspublicrepositoriesName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AllowspublicrepositoriesName
}
object ApplicationjsonAllowspublicrepositoriesName {
  
  inline def apply(applicationSlashjson: AllowspublicrepositoriesName): ApplicationjsonAllowspublicrepositoriesName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowspublicrepositoriesName]
  }
  
  extension [Self <: ApplicationjsonAllowspublicrepositoriesName](x: Self) {
    
    inline def setApplicationSlashjson(value: AllowspublicrepositoriesName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
