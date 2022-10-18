package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[String]
}
object `27` {
  
  inline def apply(applicationSlashjson: js.Array[String]): `27` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[String]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: String*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
