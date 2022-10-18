package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson48 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `48`
}
object Applicationjson48 {
  
  inline def apply(applicationSlashjson: `48`): Applicationjson48 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson48]
  }
  
  extension [Self <: Applicationjson48](x: Self) {
    
    inline def setApplicationSlashjson(value: `48`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
