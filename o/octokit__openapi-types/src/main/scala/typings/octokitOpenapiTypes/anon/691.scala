package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `691` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Changetype]
}
object `691` {
  
  inline def apply(applicationSlashjson: js.Array[Changetype]): `691` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`691`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `691`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Changetype]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Changetype*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
