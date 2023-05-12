package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `491` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Subject]
}
object `491` {
  
  inline def apply(applicationSlashjson: js.Array[Subject]): `491` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`491`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `491`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Subject]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Subject*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
