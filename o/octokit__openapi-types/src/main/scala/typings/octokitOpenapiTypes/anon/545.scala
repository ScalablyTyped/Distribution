package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `545` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[EnvironmentsState]
}
object `545` {
  
  inline def apply(applicationSlashjson: js.Array[EnvironmentsState]): `545` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`545`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `545`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[EnvironmentsState]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: EnvironmentsState*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
