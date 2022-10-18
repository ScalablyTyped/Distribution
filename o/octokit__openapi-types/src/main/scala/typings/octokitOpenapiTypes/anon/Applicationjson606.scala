package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson606 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `606`
}
object Applicationjson606 {
  
  inline def apply(applicationSlashjson: `606`): Applicationjson606 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson606]
  }
  
  extension [Self <: Applicationjson606](x: Self) {
    
    inline def setApplicationSlashjson(value: `606`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
