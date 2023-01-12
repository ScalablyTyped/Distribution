package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPusher extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Pusher
}
object ApplicationjsonPusher {
  
  inline def apply(applicationSlashjson: Pusher): ApplicationjsonPusher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPusher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPusher] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Pusher): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
