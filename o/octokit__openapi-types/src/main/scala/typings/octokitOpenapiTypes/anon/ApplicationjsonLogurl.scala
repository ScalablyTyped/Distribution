package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLogurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Logurl
}
object ApplicationjsonLogurl {
  
  inline def apply(applicationSlashjson: Logurl): ApplicationjsonLogurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLogurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLogurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Logurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
