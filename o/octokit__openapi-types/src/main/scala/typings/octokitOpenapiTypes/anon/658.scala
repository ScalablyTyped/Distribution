package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `658` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[IdKey]
}
object `658` {
  
  inline def apply(applicationSlashjson: js.Array[IdKey]): `658` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`658`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `658`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[IdKey]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: IdKey*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
