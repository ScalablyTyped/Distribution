package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `581` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Tokenexpiresat]
}
object `581` {
  
  inline def apply(applicationSlashjson: js.Array[Tokenexpiresat]): `581` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`581`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `581`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Tokenexpiresat]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Tokenexpiresat*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
