package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `494` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Error]
}
object `494` {
  
  inline def apply(applicationSlashjson: js.Array[Error]): `494` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`494`]
  }
  
  extension [Self <: `494`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Error]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Error*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
