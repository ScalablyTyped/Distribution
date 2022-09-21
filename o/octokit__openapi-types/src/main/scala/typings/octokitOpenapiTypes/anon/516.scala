package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `516` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Resultscount]
}
object `516` {
  
  inline def apply(applicationSlashjson: js.Array[Resultscount]): `516` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`516`]
  }
  
  extension [Self <: `516`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Resultscount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Resultscount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
