package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `493` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Category]
}
object `493` {
  
  inline def apply(applicationSlashjson: js.Array[Category]): `493` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`493`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `493`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Category]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Category*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
