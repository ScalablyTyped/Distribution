package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson291 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `291`
}
object Applicationjson291 {
  
  inline def apply(applicationSlashjson: `291`): Applicationjson291 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson291]
  }
  
  extension [Self <: Applicationjson291](x: Self) {
    
    inline def setApplicationSlashjson(value: `291`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
