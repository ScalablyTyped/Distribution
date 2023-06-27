package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `667` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Category]
}
object `667` {
  
  inline def apply(applicationSlashjson: js.Array[Category]): `667` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`667`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `667`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Category]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Category*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
