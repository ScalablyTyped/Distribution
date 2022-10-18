package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson138 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `138`
}
object Applicationjson138 {
  
  inline def apply(applicationSlashjson: `138`): Applicationjson138 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson138]
  }
  
  extension [Self <: Applicationjson138](x: Self) {
    
    inline def setApplicationSlashjson(value: `138`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
