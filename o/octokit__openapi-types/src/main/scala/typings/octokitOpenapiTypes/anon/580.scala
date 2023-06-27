package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `580` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Hooksurl]
}
object `580` {
  
  inline def apply(applicationSlashjson: js.Array[Hooksurl]): `580` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`580`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `580`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Hooksurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Hooksurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
