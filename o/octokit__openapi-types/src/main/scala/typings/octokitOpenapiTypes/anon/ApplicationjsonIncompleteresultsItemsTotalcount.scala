package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncompleteresultsItemsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IncompleteresultsItemsTotalcount
}
object ApplicationjsonIncompleteresultsItemsTotalcount {
  
  inline def apply(applicationSlashjson: IncompleteresultsItemsTotalcount): ApplicationjsonIncompleteresultsItemsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncompleteresultsItemsTotalcount]
  }
  
  extension [Self <: ApplicationjsonIncompleteresultsItemsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: IncompleteresultsItemsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
