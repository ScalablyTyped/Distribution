package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `327` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Expectedheadsha | Null
}
object `327` {
  
  inline def apply(): `327` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`327`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `327`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Expectedheadsha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
