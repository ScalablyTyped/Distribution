package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `556` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Contactemail]
}
object `556` {
  
  inline def apply(applicationSlashjson: js.Array[Contactemail]): `556` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`556`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `556`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Contactemail]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Contactemail*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
