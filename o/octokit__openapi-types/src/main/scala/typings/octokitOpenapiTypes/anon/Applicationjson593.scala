package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson593 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `593`
}
object Applicationjson593 {
  
  inline def apply(applicationSlashjson: `593`): Applicationjson593 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson593]
  }
  
  extension [Self <: Applicationjson593](x: Self) {
    
    inline def setApplicationSlashjson(value: `593`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
