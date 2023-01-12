package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `487` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Protection]
}
object `487` {
  
  inline def apply(applicationSlashjson: js.Array[Protection]): `487` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`487`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `487`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Protection]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Protection*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
