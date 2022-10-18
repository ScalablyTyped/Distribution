package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Category]
}
object `103` {
  
  inline def apply(applicationSlashjson: js.Array[Category]): `103` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`103`]
  }
  
  extension [Self <: `103`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Category]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Category*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
