package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `621` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Rules]
}
object `621` {
  
  inline def apply(applicationSlashjson: js.Array[Rules]): `621` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`621`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `621`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Rules]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Rules*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
