package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Clientip | Null
}
object `207` {
  
  inline def apply(): `207` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`207`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `207`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Clientip): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
