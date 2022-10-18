package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson217 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `217`
}
object Applicationjson217 {
  
  inline def apply(applicationSlashjson: `217`): Applicationjson217 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson217]
  }
  
  extension [Self <: Applicationjson217](x: Self) {
    
    inline def setApplicationSlashjson(value: `217`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
