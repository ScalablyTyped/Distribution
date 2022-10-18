package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Assetsurl]
}
object `176` {
  
  inline def apply(applicationSlashjson: js.Array[Assetsurl]): `176` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`176`]
  }
  
  extension [Self <: `176`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Assetsurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Assetsurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
