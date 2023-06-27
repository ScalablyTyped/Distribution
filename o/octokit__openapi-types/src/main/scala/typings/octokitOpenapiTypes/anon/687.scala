package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `687` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Contributions]
}
object `687` {
  
  inline def apply(applicationSlashjson: js.Array[Contributions]): `687` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`687`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `687`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Contributions]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Contributions*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
