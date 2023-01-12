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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNameSelectedrepositoriesurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NameSelectedrepositoriesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
