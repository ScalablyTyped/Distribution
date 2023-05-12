package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTesturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Testurl
}
object ApplicationjsonTesturl {
  
  inline def apply(applicationSlashjson: Testurl): ApplicationjsonTesturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTesturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonTesturl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Testurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
