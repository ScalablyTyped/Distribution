package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `447` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Parent]
}
object `447` {
  
  inline def apply(applicationSlashjson: js.Array[Parent]): `447` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`447`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `447`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Parent]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Parent*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
