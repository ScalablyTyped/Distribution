package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `562` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Category]
}
object `562` {
  
  inline def apply(applicationSlashjson: js.Array[Category]): `562` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`562`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `562`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Category]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Category*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
