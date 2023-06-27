package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `652` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Waittimerstartedat]
}
object `652` {
  
  inline def apply(applicationSlashjson: js.Array[Waittimerstartedat]): `652` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`652`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `652`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Waittimerstartedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Waittimerstartedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
