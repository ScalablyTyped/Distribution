package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameSelectedrepositoriesurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameSelectedrepositoriesurl
}
object ApplicationjsonNameSelectedrepositoriesurl {
  
  inline def apply(applicationSlashjson: NameSelectedrepositoriesurl): ApplicationjsonNameSelectedrepositoriesurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameSelectedrepositoriesurl]
  }
  
  extension [Self <: ApplicationjsonNameSelectedrepositoriesurl](x: Self) {
    
    inline def setApplicationSlashjson(value: NameSelectedrepositoriesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
