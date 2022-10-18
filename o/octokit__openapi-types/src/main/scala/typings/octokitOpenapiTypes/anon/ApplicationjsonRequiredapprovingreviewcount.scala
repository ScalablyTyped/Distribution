package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRequiredapprovingreviewcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Requiredapprovingreviewcount
}
object ApplicationjsonRequiredapprovingreviewcount {
  
  inline def apply(applicationSlashjson: Requiredapprovingreviewcount): ApplicationjsonRequiredapprovingreviewcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRequiredapprovingreviewcount]
  }
  
  extension [Self <: ApplicationjsonRequiredapprovingreviewcount](x: Self) {
    
    inline def setApplicationSlashjson(value: Requiredapprovingreviewcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
