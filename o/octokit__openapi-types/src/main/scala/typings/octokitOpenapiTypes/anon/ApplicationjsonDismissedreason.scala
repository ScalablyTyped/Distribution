package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissedreason extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Dismissedreason
}
object ApplicationjsonDismissedreason {
  
  inline def apply(applicationSlashjson: Dismissedreason): ApplicationjsonDismissedreason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissedreason]
  }
  
  extension [Self <: ApplicationjsonDismissedreason](x: Self) {
    
    inline def setApplicationSlashjson(value: Dismissedreason): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
