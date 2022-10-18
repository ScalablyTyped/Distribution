package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson94 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `94`
}
object Applicationjson94 {
  
  inline def apply(applicationSlashjson: `94`): Applicationjson94 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson94]
  }
  
  extension [Self <: Applicationjson94](x: Self) {
    
    inline def setApplicationSlashjson(value: `94`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
