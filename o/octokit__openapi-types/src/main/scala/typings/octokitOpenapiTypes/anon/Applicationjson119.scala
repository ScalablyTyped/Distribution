package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson119 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `119`
}
object Applicationjson119 {
  
  inline def apply(applicationSlashjson: `119`): Applicationjson119 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson119]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson119] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `119`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
