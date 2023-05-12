package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `550` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Waittimerstartedat]
}
object `550` {
  
  inline def apply(applicationSlashjson: js.Array[Waittimerstartedat]): `550` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`550`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `550`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Waittimerstartedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Waittimerstartedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
