package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson254 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `254`
}
object Applicationjson254 {
  
  inline def apply(applicationSlashjson: `254`): Applicationjson254 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson254]
  }
  
  extension [Self <: Applicationjson254](x: Self) {
    
    inline def setApplicationSlashjson(value: `254`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
