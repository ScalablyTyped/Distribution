package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowforking extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowforking
}
object ApplicationjsonAllowforking {
  
  inline def apply(applicationSlashjson: Allowforking): ApplicationjsonAllowforking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowforking]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowforking] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Allowforking): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
