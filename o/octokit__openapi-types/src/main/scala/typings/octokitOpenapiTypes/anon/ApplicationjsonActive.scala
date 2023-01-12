package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonActive extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Active
}
object ApplicationjsonActive {
  
  inline def apply(applicationSlashjson: Active): ApplicationjsonActive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonActive] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Active): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
