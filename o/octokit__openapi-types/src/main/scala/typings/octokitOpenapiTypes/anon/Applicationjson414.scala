package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson414 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `414`
}
object Applicationjson414 {
  
  inline def apply(applicationSlashjson: `414`): Applicationjson414 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson414]
  }
  
  extension [Self <: Applicationjson414](x: Self) {
    
    inline def setApplicationSlashjson(value: `414`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
