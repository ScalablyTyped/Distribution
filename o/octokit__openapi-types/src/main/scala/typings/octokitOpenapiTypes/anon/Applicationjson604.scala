package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson604 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `604`
}
object Applicationjson604 {
  
  inline def apply(applicationSlashjson: `604`): Applicationjson604 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson604]
  }
  
  extension [Self <: Applicationjson604](x: Self) {
    
    inline def setApplicationSlashjson(value: `604`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
