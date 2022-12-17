package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson411 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `411`
}
object Applicationjson411 {
  
  inline def apply(applicationSlashjson: `411`): Applicationjson411 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson411]
  }
  
  extension [Self <: Applicationjson411](x: Self) {
    
    inline def setApplicationSlashjson(value: `411`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
