package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `375` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Commitmessage | Null
}
object `375` {
  
  inline def apply(): `375` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`375`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `375`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Commitmessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
