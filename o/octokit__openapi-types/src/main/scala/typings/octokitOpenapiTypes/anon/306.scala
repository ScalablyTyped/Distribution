package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `306` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Source | Null
}
object `306` {
  
  inline def apply(): `306` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`306`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `306`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Source): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
