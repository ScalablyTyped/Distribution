package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson393 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `393`
}
object Applicationjson393 {
  
  inline def apply(applicationSlashjson: `393`): Applicationjson393 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson393]
  }
  
  extension [Self <: Applicationjson393](x: Self) {
    
    inline def setApplicationSlashjson(value: `393`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
