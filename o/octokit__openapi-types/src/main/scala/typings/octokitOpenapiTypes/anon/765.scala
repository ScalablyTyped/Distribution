package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `765` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Weeks]
}
object `765` {
  
  inline def apply(applicationSlashjson: js.Array[Weeks]): `765` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`765`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `765`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Weeks]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Weeks*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
