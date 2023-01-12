package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAppsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AppsArray
}
object ApplicationjsonAppsArray {
  
  inline def apply(applicationSlashjson: AppsArray): ApplicationjsonAppsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAppsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAppsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: AppsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
