package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonItemsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ItemsArray
}
object ApplicationjsonItemsArray {
  
  inline def apply(applicationSlashjson: ItemsArray): ApplicationjsonItemsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonItemsArray]
  }
  
  extension [Self <: ApplicationjsonItemsArray](x: Self) {
    
    inline def setApplicationSlashjson(value: ItemsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
