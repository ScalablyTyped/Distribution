package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `514` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Instancesurl]
}
object `514` {
  
  inline def apply(applicationSlashjson: js.Array[Instancesurl]): `514` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`514`]
  }
  
  extension [Self <: `514`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Instancesurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Instancesurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
