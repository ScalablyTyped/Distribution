package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `468` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyColumnsurl]
}
object `468` {
  
  inline def apply(applicationSlashjson: js.Array[BodyColumnsurl]): `468` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`468`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `468`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodyColumnsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyColumnsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
