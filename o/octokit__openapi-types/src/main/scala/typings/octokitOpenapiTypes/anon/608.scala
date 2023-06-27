package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `608` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Excludeownerprojects]
}
object `608` {
  
  inline def apply(applicationSlashjson: js.Array[Excludeownerprojects]): `608` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`608`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `608`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Excludeownerprojects]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Excludeownerprojects*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
