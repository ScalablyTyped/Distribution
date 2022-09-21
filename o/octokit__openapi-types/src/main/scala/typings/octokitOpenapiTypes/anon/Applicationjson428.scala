package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson428 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `428`
}
object Applicationjson428 {
  
  inline def apply(applicationSlashjson: `428`): Applicationjson428 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson428]
  }
  
  extension [Self <: Applicationjson428](x: Self) {
    
    inline def setApplicationSlashjson(value: `428`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
