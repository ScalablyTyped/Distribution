package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPingurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Pingurl
}
object ApplicationjsonPingurl {
  
  inline def apply(applicationSlashjson: Pingurl): ApplicationjsonPingurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPingurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPingurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Pingurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
