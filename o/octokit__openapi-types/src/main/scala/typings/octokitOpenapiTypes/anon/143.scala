package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Reviewrequester]
}
object `143` {
  
  inline def apply(applicationSlashjson: js.Array[Reviewrequester]): `143` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  
  extension [Self <: `143`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Reviewrequester]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Reviewrequester*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
