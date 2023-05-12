package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `586` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Testurl]
}
object `586` {
  
  inline def apply(applicationSlashjson: js.Array[Testurl]): `586` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`586`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `586`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Testurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Testurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
