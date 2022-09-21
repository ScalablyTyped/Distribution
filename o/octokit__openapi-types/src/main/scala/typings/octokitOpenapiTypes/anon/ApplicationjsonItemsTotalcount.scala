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
  
  extension [Self <: ApplicationjsonItemsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: ItemsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
