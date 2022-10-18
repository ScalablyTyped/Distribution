package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Primary]
}
object `198` {
  
  inline def apply(applicationSlashjson: js.Array[Primary]): `198` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`198`]
  }
  
  extension [Self <: `198`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Primary]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Primary*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
