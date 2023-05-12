package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson91 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `91`
}
object Applicationjson91 {
  
  inline def apply(applicationSlashjson: `91`): Applicationjson91 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson91]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson91] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `91`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
