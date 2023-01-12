package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConfirmdeleteurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Confirmdeleteurl
}
object ApplicationjsonConfirmdeleteurl {
  
  inline def apply(applicationSlashjson: Confirmdeleteurl): ApplicationjsonConfirmdeleteurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConfirmdeleteurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonConfirmdeleteurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Confirmdeleteurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
