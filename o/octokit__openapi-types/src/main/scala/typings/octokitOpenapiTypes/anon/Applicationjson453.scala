package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson453 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `453`
}
object Applicationjson453 {
  
  inline def apply(applicationSlashjson: `453`): Applicationjson453 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson453]
  }
  
  extension [Self <: Applicationjson453](x: Self) {
    
    inline def setApplicationSlashjson(value: `453`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
