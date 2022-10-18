package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson313 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `313`
}
object Applicationjson313 {
  
  inline def apply(applicationSlashjson: `313`): Applicationjson313 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson313]
  }
  
  extension [Self <: Applicationjson313](x: Self) {
    
    inline def setApplicationSlashjson(value: `313`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
