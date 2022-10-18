package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[js.Array[Double]]
}
object `184` {
  
  inline def apply(applicationSlashjson: js.Array[js.Array[Double]]): `184` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`184`]
  }
  
  extension [Self <: `184`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: js.Array[Double]*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
