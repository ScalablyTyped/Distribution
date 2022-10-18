package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson164 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `164`
}
object Applicationjson164 {
  
  inline def apply(applicationSlashjson: `164`): Applicationjson164 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson164]
  }
  
  extension [Self <: Applicationjson164](x: Self) {
    
    inline def setApplicationSlashjson(value: `164`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
