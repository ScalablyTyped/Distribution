package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `267` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `265` | `266`
}
object `267` {
  
  inline def apply(applicationSlashjson: `265` | `266`): `267` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`267`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `267`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `265` | `266`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
