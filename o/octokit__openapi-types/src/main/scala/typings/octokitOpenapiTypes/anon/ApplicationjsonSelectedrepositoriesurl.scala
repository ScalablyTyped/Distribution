package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedrepositoriesurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Selectedrepositoriesurl
}
object ApplicationjsonSelectedrepositoriesurl {
  
  inline def apply(applicationSlashjson: Selectedrepositoriesurl): ApplicationjsonSelectedrepositoriesurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedrepositoriesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSelectedrepositoriesurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Selectedrepositoriesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
