package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson258 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `258`
}
object Applicationjson258 {
  
  inline def apply(applicationSlashjson: `258`): Applicationjson258 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson258]
  }
  
  extension [Self <: Applicationjson258](x: Self) {
    
    inline def setApplicationSlashjson(value: `258`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
