package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `571` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Assetsurl]
}
object `571` {
  
  inline def apply(applicationSlashjson: js.Array[Assetsurl]): `571` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`571`]
  }
  
  extension [Self <: `571`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Assetsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Assetsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
