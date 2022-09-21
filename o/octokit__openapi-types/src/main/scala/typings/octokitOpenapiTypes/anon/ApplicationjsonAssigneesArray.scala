package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAssigneesArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AssigneesArray
}
object ApplicationjsonAssigneesArray {
  
  inline def apply(applicationSlashjson: AssigneesArray): ApplicationjsonAssigneesArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAssigneesArray]
  }
  
  extension [Self <: ApplicationjsonAssigneesArray](x: Self) {
    
    inline def setApplicationSlashjson(value: AssigneesArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
