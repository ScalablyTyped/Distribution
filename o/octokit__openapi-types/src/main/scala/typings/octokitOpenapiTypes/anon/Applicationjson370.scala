package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson370 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `370`
}
object Applicationjson370 {
  
  inline def apply(applicationSlashjson: `370`): Applicationjson370 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson370]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson370] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `370`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
