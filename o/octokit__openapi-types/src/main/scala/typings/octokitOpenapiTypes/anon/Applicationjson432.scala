package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson432 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `432`
}
object Applicationjson432 {
  
  inline def apply(applicationSlashjson: `432`): Applicationjson432 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson432]
  }
  
  extension [Self <: Applicationjson432](x: Self) {
    
    inline def setApplicationSlashjson(value: `432`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
