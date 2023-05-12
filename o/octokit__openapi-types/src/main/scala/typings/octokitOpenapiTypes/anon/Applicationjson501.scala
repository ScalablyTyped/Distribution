package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson501 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `501`
}
object Applicationjson501 {
  
  inline def apply(applicationSlashjson: `501`): Applicationjson501 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson501]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson501] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `501`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
