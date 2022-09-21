package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `523` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Mergecommitsha]
}
object `523` {
  
  inline def apply(applicationSlashjson: js.Array[Mergecommitsha]): `523` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`523`]
  }
  
  extension [Self <: `523`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Mergecommitsha]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Mergecommitsha*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
