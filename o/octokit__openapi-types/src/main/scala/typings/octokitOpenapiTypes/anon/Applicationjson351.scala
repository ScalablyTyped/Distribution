package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson351 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `351`
}
object Applicationjson351 {
  
  inline def apply(applicationSlashjson: `351`): Applicationjson351 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson351]
  }
  
  extension [Self <: Applicationjson351](x: Self) {
    
    inline def setApplicationSlashjson(value: `351`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
