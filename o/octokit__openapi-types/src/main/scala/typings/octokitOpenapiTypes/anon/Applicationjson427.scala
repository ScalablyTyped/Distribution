package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson427 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `427`
}
object Applicationjson427 {
  
  inline def apply(applicationSlashjson: `427`): Applicationjson427 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson427]
  }
  
  extension [Self <: Applicationjson427](x: Self) {
    
    inline def setApplicationSlashjson(value: `427`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
