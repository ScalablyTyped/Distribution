package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `510` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Environmenturl]
}
object `510` {
  
  inline def apply(applicationSlashjson: js.Array[Environmenturl]): `510` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`510`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `510`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Environmenturl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Environmenturl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
