package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson481 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `481`
}
object Applicationjson481 {
  
  inline def apply(applicationSlashjson: `481`): Applicationjson481 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson481]
  }
  
  extension [Self <: Applicationjson481](x: Self) {
    
    inline def setApplicationSlashjson(value: `481`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
