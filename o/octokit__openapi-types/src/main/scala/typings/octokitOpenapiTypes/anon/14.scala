package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Architecture]
}
object `14` {
  
  inline def apply(applicationSlashjson: js.Array[Architecture]): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Architecture]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Architecture*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
