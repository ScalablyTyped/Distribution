package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson193 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `193`
}
object Applicationjson193 {
  
  inline def apply(applicationSlashjson: `193`): Applicationjson193 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson193]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson193] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `193`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
