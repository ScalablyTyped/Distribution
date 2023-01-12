package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSubscribed extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Subscribed
}
object ApplicationjsonSubscribed {
  
  inline def apply(applicationSlashjson: Subscribed): ApplicationjsonSubscribed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSubscribed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSubscribed] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Subscribed): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
