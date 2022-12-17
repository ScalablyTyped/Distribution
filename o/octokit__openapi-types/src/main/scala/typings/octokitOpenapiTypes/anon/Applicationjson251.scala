package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson251 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `251`
}
object Applicationjson251 {
  
  inline def apply(applicationSlashjson: `251`): Applicationjson251 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson251]
  }
  
  extension [Self <: Applicationjson251](x: Self) {
    
    inline def setApplicationSlashjson(value: `251`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
