package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson382 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `382`
}
object Applicationjson382 {
  
  inline def apply(applicationSlashjson: `382`): Applicationjson382 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson382]
  }
  
  extension [Self <: Applicationjson382](x: Self) {
    
    inline def setApplicationSlashjson(value: `382`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
