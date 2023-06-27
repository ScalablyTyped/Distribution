package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `657` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Keyprefix]
}
object `657` {
  
  inline def apply(applicationSlashjson: js.Array[Keyprefix]): `657` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`657`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `657`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Keyprefix]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Keyprefix*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
