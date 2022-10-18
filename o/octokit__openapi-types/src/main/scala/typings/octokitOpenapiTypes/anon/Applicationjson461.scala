package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson461 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `461`
}
object Applicationjson461 {
  
  inline def apply(applicationSlashjson: `461`): Applicationjson461 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson461]
  }
  
  extension [Self <: Applicationjson461](x: Self) {
    
    inline def setApplicationSlashjson(value: `461`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
