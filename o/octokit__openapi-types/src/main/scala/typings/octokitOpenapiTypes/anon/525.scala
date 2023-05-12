package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `525` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyColumnsurl]
}
object `525` {
  
  inline def apply(applicationSlashjson: js.Array[BodyColumnsurl]): `525` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`525`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `525`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[BodyColumnsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyColumnsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
