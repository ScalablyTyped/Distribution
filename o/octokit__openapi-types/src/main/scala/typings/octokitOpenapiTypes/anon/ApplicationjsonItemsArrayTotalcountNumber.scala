package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonItemsArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ItemsArrayTotalcountNumber
}
object ApplicationjsonItemsArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: ItemsArrayTotalcountNumber): ApplicationjsonItemsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonItemsArrayTotalcountNumber]
  }
  
  extension [Self <: ApplicationjsonItemsArrayTotalcountNumber](x: Self) {
    
    inline def setApplicationSlashjson(value: ItemsArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
