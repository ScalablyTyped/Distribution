package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonItemsPerPage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ItemsPerPage
}
object ApplicationjsonItemsPerPage {
  
  inline def apply(applicationSlashjson: ItemsPerPage): ApplicationjsonItemsPerPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonItemsPerPage]
  }
  
  extension [Self <: ApplicationjsonItemsPerPage](x: Self) {
    
    inline def setApplicationSlashjson(value: ItemsPerPage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
