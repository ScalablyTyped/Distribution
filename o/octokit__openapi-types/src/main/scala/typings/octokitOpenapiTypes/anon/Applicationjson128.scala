package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson128 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `128`
}
object Applicationjson128 {
  
  inline def apply(applicationSlashjson: `128`): Applicationjson128 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson128]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson128] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `128`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
