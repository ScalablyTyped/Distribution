package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Appslug]
}
object `9` {
  
  inline def apply(applicationSlashjson: js.Array[Appslug]): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Appslug]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Appslug*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
