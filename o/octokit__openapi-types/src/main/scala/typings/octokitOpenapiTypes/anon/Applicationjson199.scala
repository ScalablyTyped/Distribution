package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson199 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `199`
}
object Applicationjson199 {
  
  inline def apply(applicationSlashjson: `199`): Applicationjson199 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson199]
  }
  
  extension [Self <: Applicationjson199](x: Self) {
    
    inline def setApplicationSlashjson(value: `199`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
