package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `425` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Bodyhtml]
}
object `425` {
  
  inline def apply(applicationSlashjson: js.Array[Bodyhtml]): `425` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`425`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `425`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Bodyhtml]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Bodyhtml*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
