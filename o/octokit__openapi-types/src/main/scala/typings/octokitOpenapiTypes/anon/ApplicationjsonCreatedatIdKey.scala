package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedatIdKey extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreatedatIdKey
}
object ApplicationjsonCreatedatIdKey {
  
  inline def apply(applicationSlashjson: CreatedatIdKey): ApplicationjsonCreatedatIdKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedatIdKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCreatedatIdKey] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CreatedatIdKey): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
