package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `596` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[KeyString]
}
object `596` {
  
  inline def apply(applicationSlashjson: js.Array[KeyString]): `596` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`596`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `596`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[KeyString]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: KeyString*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
