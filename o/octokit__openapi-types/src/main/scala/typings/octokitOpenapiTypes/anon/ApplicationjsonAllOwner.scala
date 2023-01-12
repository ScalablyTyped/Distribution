package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllOwner extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AllOwner
}
object ApplicationjsonAllOwner {
  
  inline def apply(applicationSlashjson: AllOwner): ApplicationjsonAllOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllOwner] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: AllOwner): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
