package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Columnurl]
}
object `72` {
  
  inline def apply(applicationSlashjson: js.Array[Columnurl]): `72` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`72`]
  }
  
  extension [Self <: `72`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Columnurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Columnurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
