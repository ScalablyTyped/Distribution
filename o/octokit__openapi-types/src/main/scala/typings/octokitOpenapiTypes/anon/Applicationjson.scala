package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Documentationurl
}
object Applicationjson {
  
  inline def apply(applicationSlashjson: Documentationurl): Applicationjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson]
  }
  
  extension [Self <: Applicationjson](x: Self) {
    
    inline def setApplicationSlashjson(value: Documentationurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
