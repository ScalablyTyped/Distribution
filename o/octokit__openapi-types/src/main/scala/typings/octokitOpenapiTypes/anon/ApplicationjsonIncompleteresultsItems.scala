package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncompleteresultsItems extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IncompleteresultsItems
}
object ApplicationjsonIncompleteresultsItems {
  
  inline def apply(applicationSlashjson: IncompleteresultsItems): ApplicationjsonIncompleteresultsItems = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncompleteresultsItems]
  }
  
  extension [Self <: ApplicationjsonIncompleteresultsItems](x: Self) {
    
    inline def setApplicationSlashjson(value: IncompleteresultsItems): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
