package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `618` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyColumnsurl]
}
object `618` {
  
  inline def apply(applicationSlashjson: js.Array[BodyColumnsurl]): `618` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`618`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `618`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodyColumnsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyColumnsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
