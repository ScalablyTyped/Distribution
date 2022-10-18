package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson249 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `249`
}
object Applicationjson249 {
  
  inline def apply(applicationSlashjson: `249`): Applicationjson249 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson249]
  }
  
  extension [Self <: Applicationjson249](x: Self) {
    
    inline def setApplicationSlashjson(value: `249`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
