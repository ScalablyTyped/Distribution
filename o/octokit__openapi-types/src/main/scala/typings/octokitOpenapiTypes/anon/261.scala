package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `261` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Vcs | Null
}
object `261` {
  
  inline def apply(): `261` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`261`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `261`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Vcs): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
