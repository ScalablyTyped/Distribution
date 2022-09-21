package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonVisibility extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Visibility
}
object ApplicationjsonVisibility {
  
  inline def apply(applicationSlashjson: Visibility): ApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonVisibility]
  }
  
  extension [Self <: ApplicationjsonVisibility](x: Self) {
    
    inline def setApplicationSlashjson(value: Visibility): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
