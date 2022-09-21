package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `446` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Subject]
}
object `446` {
  
  inline def apply(applicationSlashjson: js.Array[Subject]): `446` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`446`]
  }
  
  extension [Self <: `446`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Subject]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Subject*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
