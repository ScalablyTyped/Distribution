package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `577` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Logurl]
}
object `577` {
  
  inline def apply(applicationSlashjson: js.Array[Logurl]): `577` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`577`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `577`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Logurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Logurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
