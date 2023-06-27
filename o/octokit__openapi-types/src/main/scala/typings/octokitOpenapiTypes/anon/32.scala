package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[String]
}
object `32` {
  
  inline def apply(applicationSlashjson: js.Array[String]): `32` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `32`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[String]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: String*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
