package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `673` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Allowupdatebranch | StarredatString]
}
object `673` {
  
  inline def apply(applicationSlashjson: js.Array[Allowupdatebranch | StarredatString]): `673` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`673`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `673`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Allowupdatebranch | StarredatString]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: (Allowupdatebranch | StarredatString)*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
