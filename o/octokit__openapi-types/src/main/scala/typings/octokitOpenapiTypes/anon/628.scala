package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `628` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Creditsdetailed]
}
object `628` {
  
  inline def apply(applicationSlashjson: js.Array[Creditsdetailed]): `628` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`628`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `628`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Creditsdetailed]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Creditsdetailed*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
