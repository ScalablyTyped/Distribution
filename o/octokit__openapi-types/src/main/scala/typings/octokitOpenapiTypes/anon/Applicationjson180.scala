package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson180 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `180`
}
object Applicationjson180 {
  
  inline def apply(applicationSlashjson: `180`): Applicationjson180 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson180]
  }
  
  extension [Self <: Applicationjson180](x: Self) {
    
    inline def setApplicationSlashjson(value: `180`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
