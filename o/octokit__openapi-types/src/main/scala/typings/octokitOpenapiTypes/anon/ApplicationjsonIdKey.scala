package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIdKey extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IdKey
}
object ApplicationjsonIdKey {
  
  inline def apply(applicationSlashjson: IdKey): ApplicationjsonIdKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIdKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonIdKey] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: IdKey): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
