package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `592` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[CreatedatIdKey]
}
object `592` {
  
  inline def apply(applicationSlashjson: js.Array[CreatedatIdKey]): `592` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`592`]
  }
  
  extension [Self <: `592`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[CreatedatIdKey]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: CreatedatIdKey*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
