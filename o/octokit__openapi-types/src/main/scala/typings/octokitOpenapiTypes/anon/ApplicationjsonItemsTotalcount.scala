package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonItemsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ItemsTotalcount
}
object ApplicationjsonItemsTotalcount {
  
  inline def apply(applicationSlashjson: ItemsTotalcount): ApplicationjsonItemsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonItemsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonItemsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ItemsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
