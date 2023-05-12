package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `571` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[ContextCreatedat]
}
object `571` {
  
  inline def apply(applicationSlashjson: js.Array[ContextCreatedat]): `571` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`571`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `571`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[ContextCreatedat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: ContextCreatedat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
