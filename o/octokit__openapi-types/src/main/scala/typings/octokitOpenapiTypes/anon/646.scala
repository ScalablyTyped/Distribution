package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `646` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[EnvironmentsState]
}
object `646` {
  
  inline def apply(applicationSlashjson: js.Array[EnvironmentsState]): `646` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`646`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `646`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[EnvironmentsState]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: EnvironmentsState*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
