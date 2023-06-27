package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `382` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Expectedheadsha | Null
}
object `382` {
  
  inline def apply(): `382` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`382`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `382`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Expectedheadsha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
