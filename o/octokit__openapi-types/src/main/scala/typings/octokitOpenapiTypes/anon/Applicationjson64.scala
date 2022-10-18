package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson64 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `64`
}
object Applicationjson64 {
  
  inline def apply(applicationSlashjson: `64`): Applicationjson64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson64]
  }
  
  extension [Self <: Applicationjson64](x: Self) {
    
    inline def setApplicationSlashjson(value: `64`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
