package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson67 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `67`
}
object Applicationjson67 {
  
  inline def apply(applicationSlashjson: `67`): Applicationjson67 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson67]
  }
  
  extension [Self <: Applicationjson67](x: Self) {
    
    inline def setApplicationSlashjson(value: `67`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
