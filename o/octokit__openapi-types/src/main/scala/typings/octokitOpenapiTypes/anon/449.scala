package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `449` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Excludeownerprojects]
}
object `449` {
  
  inline def apply(applicationSlashjson: js.Array[Excludeownerprojects]): `449` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`449`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `449`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Excludeownerprojects]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Excludeownerprojects*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
