package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Totalcount
}
object ApplicationjsonTotalcount {
  
  inline def apply(applicationSlashjson: Totalcount): ApplicationjsonTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalcount]
  }
  
  extension [Self <: ApplicationjsonTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: Totalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
