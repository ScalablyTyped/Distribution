package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson617 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `617`
}
object Applicationjson617 {
  
  inline def apply(applicationSlashjson: `617`): Applicationjson617 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson617]
  }
  
  extension [Self <: Applicationjson617](x: Self) {
    
    inline def setApplicationSlashjson(value: `617`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
