package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Annotationlevel]
}
object `100` {
  
  inline def apply(applicationSlashjson: js.Array[Annotationlevel]): `100` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`100`]
  }
  
  extension [Self <: `100`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Annotationlevel]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Annotationlevel*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
