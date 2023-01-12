package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `580` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Primary]
}
object `580` {
  
  inline def apply(applicationSlashjson: js.Array[Primary]): `580` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`580`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `580`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Primary]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Primary*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
