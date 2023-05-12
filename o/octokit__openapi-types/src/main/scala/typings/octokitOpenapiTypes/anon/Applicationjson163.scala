package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson163 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `163`
}
object Applicationjson163 {
  
  inline def apply(applicationSlashjson: `163`): Applicationjson163 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson163]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson163] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `163`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
