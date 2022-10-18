package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson314 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `314`
}
object Applicationjson314 {
  
  inline def apply(applicationSlashjson: `314`): Applicationjson314 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson314]
  }
  
  extension [Self <: Applicationjson314](x: Self) {
    
    inline def setApplicationSlashjson(value: `314`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
