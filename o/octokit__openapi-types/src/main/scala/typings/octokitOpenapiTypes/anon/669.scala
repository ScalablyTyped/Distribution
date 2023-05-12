package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `669` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[KeyString]
}
object `669` {
  
  inline def apply(applicationSlashjson: js.Array[KeyString]): `669` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`669`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `669`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[KeyString]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: KeyString*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
