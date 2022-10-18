package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson141 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `141`
}
object Applicationjson141 {
  
  inline def apply(applicationSlashjson: `141`): Applicationjson141 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson141]
  }
  
  extension [Self <: Applicationjson141](x: Self) {
    
    inline def setApplicationSlashjson(value: `141`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
