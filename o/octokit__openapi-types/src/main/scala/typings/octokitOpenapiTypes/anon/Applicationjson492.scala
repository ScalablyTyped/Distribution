package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson492 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `492`
}
object Applicationjson492 {
  
  inline def apply(applicationSlashjson: `492`): Applicationjson492 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson492]
  }
  
  extension [Self <: Applicationjson492](x: Self) {
    
    inline def setApplicationSlashjson(value: `492`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
