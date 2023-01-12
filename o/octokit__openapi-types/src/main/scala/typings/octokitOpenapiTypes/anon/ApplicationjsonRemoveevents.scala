package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRemoveevents extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Removeevents
}
object ApplicationjsonRemoveevents {
  
  inline def apply(applicationSlashjson: Removeevents): ApplicationjsonRemoveevents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRemoveevents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRemoveevents] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Removeevents): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
