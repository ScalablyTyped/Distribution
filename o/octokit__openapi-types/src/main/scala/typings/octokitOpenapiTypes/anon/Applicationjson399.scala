package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson399 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `399`
}
object Applicationjson399 {
  
  inline def apply(applicationSlashjson: `399`): Applicationjson399 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson399]
  }
  
  extension [Self <: Applicationjson399](x: Self) {
    
    inline def setApplicationSlashjson(value: `399`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
