package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson603 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `603`
}
object Applicationjson603 {
  
  inline def apply(applicationSlashjson: `603`): Applicationjson603 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson603]
  }
  
  extension [Self <: Applicationjson603](x: Self) {
    
    inline def setApplicationSlashjson(value: `603`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
