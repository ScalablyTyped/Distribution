package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissstalereviews extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Dismissstalereviews
}
object ApplicationjsonDismissstalereviews {
  
  inline def apply(applicationSlashjson: Dismissstalereviews): ApplicationjsonDismissstalereviews = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissstalereviews]
  }
  
  extension [Self <: ApplicationjsonDismissstalereviews](x: Self) {
    
    inline def setApplicationSlashjson(value: Dismissstalereviews): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
