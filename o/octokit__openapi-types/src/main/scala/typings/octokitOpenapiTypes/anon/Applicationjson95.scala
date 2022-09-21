package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson95 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `95`
}
object Applicationjson95 {
  
  inline def apply(applicationSlashjson: `95`): Applicationjson95 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson95]
  }
  
  extension [Self <: Applicationjson95](x: Self) {
    
    inline def setApplicationSlashjson(value: `95`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
