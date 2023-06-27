package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson356 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `356`
}
object Applicationjson356 {
  
  inline def apply(applicationSlashjson: `356`): Applicationjson356 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson356]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson356] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `356`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
