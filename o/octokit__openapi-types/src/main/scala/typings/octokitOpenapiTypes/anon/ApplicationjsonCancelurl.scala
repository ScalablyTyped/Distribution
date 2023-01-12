package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCancelurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Cancelurl
}
object ApplicationjsonCancelurl {
  
  inline def apply(applicationSlashjson: Cancelurl): ApplicationjsonCancelurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCancelurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCancelurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Cancelurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
