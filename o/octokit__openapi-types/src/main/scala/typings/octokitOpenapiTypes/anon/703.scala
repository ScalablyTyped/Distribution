package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `703` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Testurl]
}
object `703` {
  
  inline def apply(applicationSlashjson: js.Array[Testurl]): `703` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`703`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `703`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[Testurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Testurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
