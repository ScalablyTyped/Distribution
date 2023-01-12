package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonActionscaches extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Actionscaches
}
object ApplicationjsonActionscaches {
  
  inline def apply(applicationSlashjson: Actionscaches): ApplicationjsonActionscaches = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonActionscaches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonActionscaches] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Actionscaches): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
