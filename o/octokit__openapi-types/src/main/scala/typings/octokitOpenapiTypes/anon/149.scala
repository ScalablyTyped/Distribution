package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Permission | Null
}
object `149` {
  
  inline def apply(): `149` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`149`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `149`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Permission): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
