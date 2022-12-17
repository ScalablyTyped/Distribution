package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson114 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `114`
}
object Applicationjson114 {
  
  inline def apply(applicationSlashjson: `114`): Applicationjson114 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson114]
  }
  
  extension [Self <: Applicationjson114](x: Self) {
    
    inline def setApplicationSlashjson(value: `114`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
