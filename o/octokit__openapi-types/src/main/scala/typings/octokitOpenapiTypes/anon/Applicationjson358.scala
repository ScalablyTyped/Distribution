package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson358 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `358`
}
object Applicationjson358 {
  
  inline def apply(applicationSlashjson: `358`): Applicationjson358 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson358]
  }
  
  extension [Self <: Applicationjson358](x: Self) {
    
    inline def setApplicationSlashjson(value: `358`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
