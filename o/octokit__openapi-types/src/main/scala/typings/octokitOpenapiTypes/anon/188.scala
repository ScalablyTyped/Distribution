package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Tarballurl]
}
object `188` {
  
  inline def apply(applicationSlashjson: js.Array[Tarballurl]): `188` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  extension [Self <: `188`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Tarballurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Tarballurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
