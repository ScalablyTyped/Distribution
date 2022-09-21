package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson131 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `131`
}
object Applicationjson131 {
  
  inline def apply(applicationSlashjson: `131`): Applicationjson131 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson131]
  }
  
  extension [Self <: Applicationjson131](x: Self) {
    
    inline def setApplicationSlashjson(value: `131`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
