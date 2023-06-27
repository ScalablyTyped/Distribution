package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `792` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Primary]
}
object `792` {
  
  inline def apply(applicationSlashjson: js.Array[Primary]): `792` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`792`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `792`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Primary]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Primary*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
