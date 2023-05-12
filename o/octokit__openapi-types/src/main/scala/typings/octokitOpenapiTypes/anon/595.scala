package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `595` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Reviewrequester]
}
object `595` {
  
  inline def apply(applicationSlashjson: js.Array[Reviewrequester]): `595` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`595`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `595`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Reviewrequester]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Reviewrequester*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
