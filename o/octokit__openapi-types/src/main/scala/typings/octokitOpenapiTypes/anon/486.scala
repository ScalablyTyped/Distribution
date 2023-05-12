package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `486` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[History]
}
object `486` {
  
  inline def apply(applicationSlashjson: js.Array[History]): `486` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`486`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `486`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[History]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: History*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
