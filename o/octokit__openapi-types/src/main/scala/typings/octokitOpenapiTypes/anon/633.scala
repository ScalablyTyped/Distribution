package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `633` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Weeks]
}
object `633` {
  
  inline def apply(applicationSlashjson: js.Array[Weeks]): `633` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`633`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `633`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Weeks]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Weeks*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
