package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson34 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `34`
}
object Applicationjson34 {
  
  inline def apply(applicationSlashjson: `34`): Applicationjson34 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson34]
  }
  
  extension [Self <: Applicationjson34](x: Self) {
    
    inline def setApplicationSlashjson(value: `34`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
