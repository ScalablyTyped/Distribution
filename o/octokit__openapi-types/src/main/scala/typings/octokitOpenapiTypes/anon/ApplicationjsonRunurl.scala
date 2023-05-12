package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Runurl
}
object ApplicationjsonRunurl {
  
  inline def apply(applicationSlashjson: Runurl): ApplicationjsonRunurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRunurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Runurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
