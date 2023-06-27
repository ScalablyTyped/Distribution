package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `660` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Protectionurl]
}
object `660` {
  
  inline def apply(applicationSlashjson: js.Array[Protectionurl]): `660` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`660`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `660`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Protectionurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Protectionurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
