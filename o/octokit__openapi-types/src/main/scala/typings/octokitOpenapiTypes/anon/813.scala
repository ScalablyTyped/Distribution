package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `813` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[KeyString]
}
object `813` {
  
  inline def apply(applicationSlashjson: js.Array[KeyString]): `813` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`813`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `813`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[KeyString]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: KeyString*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
