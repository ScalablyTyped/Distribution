package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson123 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `123`
}
object Applicationjson123 {
  
  inline def apply(applicationSlashjson: `123`): Applicationjson123 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson123]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson123] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `123`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
