package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson518 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `518`
}
object Applicationjson518 {
  
  inline def apply(applicationSlashjson: `518`): Applicationjson518 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson518]
  }
  
  extension [Self <: Applicationjson518](x: Self) {
    
    inline def setApplicationSlashjson(value: `518`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
