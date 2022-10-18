package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson97 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `97`
}
object Applicationjson97 {
  
  inline def apply(applicationSlashjson: `97`): Applicationjson97 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson97]
  }
  
  extension [Self <: Applicationjson97](x: Self) {
    
    inline def setApplicationSlashjson(value: `97`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
