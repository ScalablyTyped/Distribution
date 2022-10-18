package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissalrestrictions extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Dismissalrestrictions
}
object ApplicationjsonDismissalrestrictions {
  
  inline def apply(applicationSlashjson: Dismissalrestrictions): ApplicationjsonDismissalrestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissalrestrictions]
  }
  
  extension [Self <: ApplicationjsonDismissalrestrictions](x: Self) {
    
    inline def setApplicationSlashjson(value: Dismissalrestrictions): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
