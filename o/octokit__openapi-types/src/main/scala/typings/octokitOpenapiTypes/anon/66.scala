package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Ownerurl]
}
object `66` {
  
  inline def apply(applicationSlashjson: js.Array[Ownerurl]): `66` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`66`]
  }
  
  extension [Self <: `66`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Ownerurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Ownerurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
