package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPrivacy extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Privacy
}
object ApplicationjsonPrivacy {
  
  inline def apply(applicationSlashjson: Privacy): ApplicationjsonPrivacy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPrivacy]
  }
  
  extension [Self <: ApplicationjsonPrivacy](x: Self) {
    
    inline def setApplicationSlashjson(value: Privacy): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
