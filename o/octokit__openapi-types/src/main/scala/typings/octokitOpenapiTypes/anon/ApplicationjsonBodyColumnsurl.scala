package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyColumnsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyColumnsurl
}
object ApplicationjsonBodyColumnsurl {
  
  inline def apply(applicationSlashjson: BodyColumnsurl): ApplicationjsonBodyColumnsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyColumnsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBodyColumnsurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BodyColumnsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
