package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `412` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Architecture]
}
object `412` {
  
  inline def apply(applicationSlashjson: js.Array[Architecture]): `412` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`412`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `412`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Architecture]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Architecture*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
