package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonItems extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Items
}
object ApplicationjsonItems {
  
  inline def apply(applicationSlashjson: Items): ApplicationjsonItems = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonItems] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Items): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
