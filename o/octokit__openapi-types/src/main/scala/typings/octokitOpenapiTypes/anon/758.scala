package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `758` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DetailsType]
}
object `758` {
  
  inline def apply(applicationSlashjson: js.Array[DetailsType]): `758` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`758`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `758`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[DetailsType]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DetailsType*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
