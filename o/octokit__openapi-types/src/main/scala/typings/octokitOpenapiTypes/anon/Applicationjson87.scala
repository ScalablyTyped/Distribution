package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson87 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `87`
}
object Applicationjson87 {
  
  inline def apply(applicationSlashjson: `87`): Applicationjson87 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson87]
  }
  
  extension [Self <: Applicationjson87](x: Self) {
    
    inline def setApplicationSlashjson(value: `87`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
