package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson445 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `445`
}
object Applicationjson445 {
  
  inline def apply(applicationSlashjson: `445`): Applicationjson445 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson445] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `445`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
