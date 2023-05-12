package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `528` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Ldapdn]
}
object `528` {
  
  inline def apply(applicationSlashjson: js.Array[Ldapdn]): `528` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`528`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `528`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Ldapdn]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Ldapdn*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
