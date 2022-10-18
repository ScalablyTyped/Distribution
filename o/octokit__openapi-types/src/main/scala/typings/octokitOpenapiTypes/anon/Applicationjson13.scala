package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson13 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `13`
}
object Applicationjson13 {
  
  inline def apply(applicationSlashjson: `13`): Applicationjson13 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson13]
  }
  
  extension [Self <: Applicationjson13](x: Self) {
    
    inline def setApplicationSlashjson(value: `13`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
