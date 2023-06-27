package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `588` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Architecture]
}
object `588` {
  
  inline def apply(applicationSlashjson: js.Array[Architecture]): `588` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`588`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `588`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Architecture]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Architecture*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
