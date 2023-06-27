package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `372` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Geo | Null
}
object `372` {
  
  inline def apply(): `372` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`372`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `372`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Geo): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
