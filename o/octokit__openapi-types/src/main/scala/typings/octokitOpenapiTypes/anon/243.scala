package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Defaultbranchonly | Null
}
object `243` {
  
  inline def apply(): `243` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`243`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `243`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Defaultbranchonly): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
